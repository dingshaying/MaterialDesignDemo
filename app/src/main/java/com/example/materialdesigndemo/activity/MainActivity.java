package com.example.materialdesigndemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.materialdesigndemo.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Toolbar toolbar;
    private Button btnRecycler;
    private Button btnCoordinator;
    private Button btnTab;
    private Button btnNavigation;
    private Button btnNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Android 5.0新特性");
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setTitle("Material Design Support控件");
        setSupportActionBar(toolbar);

        btnRecycler = findViewById(R.id.btn_recycler);
        btnRecycler.setOnClickListener(this);

        btnCoordinator = findViewById(R.id.btn_coordinator);
        btnCoordinator.setOnClickListener(this);

        btnTab = findViewById(R.id.btn_tab);
        btnTab.setOnClickListener(this);

        btnNavigation = findViewById(R.id.btn_navigation);
        btnNavigation.setOnClickListener(this);

        btnNotification = findViewById(R.id.btn_notification);
        btnNotification.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_recycler:
                Intent intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_coordinator:
                intent = new Intent(MainActivity.this,CoordinatorLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_tab:
                intent = new Intent(MainActivity.this, TabLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_navigation:
                intent = new Intent(MainActivity.this, DrawerNavigationActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_notification:
                intent = new Intent(MainActivity.this,NotificationActivity.class);
                startActivity(intent);
                break;
        }

    }
}
