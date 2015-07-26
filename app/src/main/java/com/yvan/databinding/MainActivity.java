package com.yvan.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yvan.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User("Yvan", "15502997135", true);
        binding.setUser(user);
    }

    public void doClick(View v) {
        switch (v.getId()){
            case R.id.btn_jump_to_rv:
                Intent intent = new Intent(this, RVAty.class);
                startActivity(intent);
                break;
            case R.id.btn_update_data:
                updateData();
                break;
        }

    }

    private void updateData() {
        user.setName("Yan");
        user.setPhone("15102972099");
        user.setIsMan(true);
    }

}
