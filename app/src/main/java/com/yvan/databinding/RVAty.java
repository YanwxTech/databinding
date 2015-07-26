package com.yvan.databinding;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class RVAty extends AppCompatActivity {

    private RecyclerView rv;
    private RecyclerView.Adapter adapter;
    private List<User> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvaty);
        rv = (RecyclerView) findViewById(R.id.rv_db);
        getData();
        adapter = new RVAdapter<User>(this, items);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData() {
        items = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("Yvan" + i);
            user.setPhone((15502997135L + i) + "");
            user.setIsMan(i >> 1 == 0);
            items.add(user);
        }
    }

}
