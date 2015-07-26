package com.yvan.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Yvan on 2015/7/22.
 */
public class RVAdapter<T> extends RecyclerView.Adapter<RVAdapter.MyViewHolder> {

    private List<T> mItems;
    private Context mContext;

    public RVAdapter( Context mContext,List<T> mData) {
        this.mItems = mData;
        this.mContext = mContext;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewDataBinding binding=
                DataBindingUtil.inflate(LayoutInflater.from(mContext),
                        R.layout.list_item,viewGroup,false);
        MyViewHolder holder=new MyViewHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(RVAdapter.MyViewHolder holder, int i) {
        final T item = mItems.get(i);
        holder.getBinding().setVariable(BR.item,item);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ViewDataBinding binding;
        public MyViewHolder(View itemView) {
            super(itemView);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }

        public void setBinding(ViewDataBinding binding) {
            this.binding = binding;
        }
    }
}
