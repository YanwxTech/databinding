package com.yvan.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Yvan on 2015/7/22.
 */
public class User extends BaseObservable{
    private String name;
    private String phone;
    private boolean isMan;



    public User() {
    }

    public User(String name, String phone,boolean isMan) {
        this.name = name;
        this.phone = phone;
        this.isMan=isMan;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
       notifyPropertyChanged(BR.name);
    }
    @Bindable
    public boolean getIsMan() {
        return isMan;
    }

    public void setIsMan(boolean isMan) {
        this.isMan = isMan;
        notifyPropertyChanged(BR.isMan);
    }
    @Bindable
    public String getPhone() {
        return phone;

    }

    public void setPhone(String phone) {
        this.phone = phone;
        notifyPropertyChanged(BR.phone);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}
