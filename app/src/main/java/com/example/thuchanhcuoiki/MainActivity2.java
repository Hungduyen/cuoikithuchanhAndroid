package com.example.thuchanhcuoiki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    ArrayList<com.example.thuchanhcuoiki.Thuoc> arrayList;
    com.example.thuchanhcuoiki.Adapter_thuoc adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listviewthuoc);
        arrayList = new ArrayList<>();
        arrayList.add(new com.example.thuchanhcuoiki.Thuoc( "Panadol Extra", "Vỉ 12 viên", "", "","", "", R.drawable.img));
        arrayList.add(new com.example.thuchanhcuoiki.Thuoc( "Phép tính cộng", "", "", "","", "", R.drawable.img_1));
        adapter = new com.example.thuchanhcuoiki.Adapter_thuoc( MainActivity2.this,R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this, com.example.thuchanhcuoiki.pheptinh.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this, com.example.thuchanhcuoiki.tuonglai.class);
                    startActivity(intent);
                }
            }
        });
    }
}