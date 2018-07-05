package com.example.thinkpad.userrecycleview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.activity.FirstActivity;
import com.example.activity.ThreeActivity;
import com.example.activity.TwoActivity;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view = findViewById(R.id.list_view);
        //设置适配器
        list_view
                .setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                        new String[]{"布局管理器", "瀑布流", "多条目 下划线 条目点击"}));
        //点击事件
        list_view.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, FirstActivity.class));
                break;
            case 1:
                startActivity(new Intent(this, TwoActivity.class));
                break;
            case 2:
                startActivity(new Intent(this, ThreeActivity.class));
                break;


        }
    }
}
