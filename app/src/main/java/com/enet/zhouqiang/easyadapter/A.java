package com.enet.zhouqiang.easyadapter;

import android.content.Context;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by zhouqiang on 2017/1/16.
 */
public class A extends EasyLVAdapter<String> {
    private final List<String> list;
    private final Context context;

    public A(Context context, List<String> list, int... layoutIds) {
        super(context, list, layoutIds);
        this.list=list;
        this.context=context;


        Log.e("zq","我提交了");
        Log.e("zq","wo you");



    }

    @Override
    public void convert(EasyLVHolder holder, final int position, String s) {

        Button tview = holder.getView(R.id.tv);

        TextView view = holder.getView(R.id.tvv);

        tview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"我被点击了"+position,Toast.LENGTH_SHORT).show();
                Log.e("zq","w我被点击了"+position);
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"我被点击了"+position,Toast.LENGTH_SHORT).show();
                Log.e("zq","w我被点击了"+position);
            }
        });

                view.setText(list.get(position));


        tview.setText(list.get(position));


}}
