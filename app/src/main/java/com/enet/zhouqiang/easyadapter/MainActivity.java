package com.enet.zhouqiang.easyadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);
        initData();
        A a = new A(MainActivity.this, list, R.layout.item);

        listView.setAdapter(a);

        a.add("sdsdsdsdd");
        a.add("sdsdsdsdd1");
        a.add("sdsdsdsdd2");
        boolean s = a.contains("12");

        int count = a.getCount();

        Log.e("zq",s+"");
        Log.e("zq",count+"");



    }

    private void initData() {
        list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

    }
}
