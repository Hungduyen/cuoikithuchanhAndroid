package com.example.thuchanhcuoiki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class huycan extends AppCompatActivity {
    ListView listView;
    ArrayList<com.example.thuchanhcuoiki.Thuoc> arrayList;
    com.example.thuchanhcuoiki.Adapter_thuoc adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listviewthuoc);
        arrayList = new ArrayList<>();
        arrayList.add(new com.example.thuchanhcuoiki.Thuoc( "Tràng giang", "Sáng tác năm 1939", "Thể thơ 7 chữ", R.drawable.img_1));
        arrayList.add(new com.example.thuchanhcuoiki.Thuoc( "Đoàn thuyền đánh cá", "", "", R.drawable.img_2));
        arrayList.add(new com.example.thuchanhcuoiki.Thuoc( "Ta viết bài thơ gọi biển về", "", "", R.drawable.img_3));
        adapter = new com.example.thuchanhcuoiki.Adapter_thuoc( huycan.this,R.layout.layout_huycan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(huycan.this, com.example.thuchanhcuoiki.tranggiang_huycan.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(huycan.this, com.example.thuchanhcuoiki.danhca_huycan.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(huycan.this, com.example.thuchanhcuoiki.bien_huycan.class);
                    startActivity(intent);
                }
            }
        });
    }
}