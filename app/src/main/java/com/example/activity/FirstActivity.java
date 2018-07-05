package com.example.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.adapter.FirstAdapter;
import com.example.thinkpad.userrecycleview.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 第一个页面
 */
public class FirstActivity extends AppCompatActivity {

    private RecyclerView recycle_view;
    private FirstAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        recycle_view = findViewById(R.id.recycler_view);
        //填充数据
        List<String> datalist = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            datalist.add("我是RecycleView" + i);
        }
        recycle_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter = new FirstAdapter(this, datalist);
        recycle_view.setAdapter(adapter);

    }
    public void list(View view) {
        recycle_view.setLayoutManager(new LinearLayoutManager(this));
        adapter.notifyDataSetChanged();
    }

    public void grid(View view) {
        recycle_view.setLayoutManager(new GridLayoutManager(this, 3));
        adapter.notifyDataSetChanged();
    }

    public void singleLine(View view) {
        recycle_view.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter.notifyDataSetChanged();
    }

    public void mutilpleLine(View view) {
        recycle_view.setLayoutManager(new GridLayoutManager(this, 3, OrientationHelper.HORIZONTAL, false));
        adapter.notifyDataSetChanged();
    }
}
