package com.example.thuchanhcuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class tuonglai extends AppCompatActivity {
    //Khai báo biến
    EditText editmacau, editcauvidu;
    Button insert, delete, update, reload;
    ListView hientaidon;
    ArrayList<String> mylist;
    ArrayAdapter<String> myadapter;
    SQLiteDatabase mydatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuonglai);

        editmacau = findViewById(R.id.editmacau);
        editcauvidu = findViewById(R.id.editcauvidu);
        insert = findViewById(R.id.insert);
        delete = findViewById(R.id.delete);
        update = findViewById(R.id.update);
        reload = findViewById(R.id.reload);

        hientaidon = findViewById(R.id.hientaidon);
        mylist = new ArrayList<>();
        myadapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mylist);
        hientaidon.setAdapter(myadapter);

        mydatabase = openOrCreateDatabase("thihientaidon.db", MODE_PRIVATE,null);

        try {
            String sql = "CREATE TABLE tblthitienganh(macau TEXT primary key, cau TEXT)";
            mydatabase.execSQL(sql);
        }
        catch (Exception e){
            Log.e("Error", "Bảng đã tồn tại");
        }
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String macau = editmacau.getText().toString();
                String cau = editcauvidu.getText().toString();
                ContentValues myvalue = new ContentValues();
                myvalue.put("macau", macau);
                myvalue.put("cau",cau);
                String msg = "";
                if(mydatabase.insert("tblthitienganh", "", myvalue) == -1){
                    msg= "FALL to Insert Record";
                }else {
                    msg = "Insert Record Successfully";
                }
                Toast.makeText(tuonglai.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String macau = editmacau.getText().toString();
                int n = mydatabase.delete("tblthitienganh", "macau = ?", new String[]{macau});
                String msg = "";
                if(n == 0){
                    msg = "No Record to Delete";
                }else {
                    msg = n + "record to Delete";
                }
                Toast.makeText(tuonglai.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cau = editcauvidu.getText().toString();
                String macau = editmacau.getText().toString();
                ContentValues myvalue = new ContentValues();
                myvalue.put("cau", cau);
                int n = mydatabase.update("tblthitienganh", myvalue, "macau =?", new String[]{macau});
                String msg = "";
                if(n == 0){
                    msg = "No Record to Update";
                }else {
                    msg = n + "record to Update";
                }
                Toast.makeText(tuonglai.this, msg, Toast.LENGTH_SHORT).show();
            }
        });
        reload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mylist.clear();
                Cursor c = mydatabase.query("tblthitienganh", null,null, null, null,null,null);
                c.moveToNext();
                String data = "";
                while (c.isAfterLast() == false){
                    data = c.getString(0) + " - " + c.getString(1);
                    c.moveToNext();
                    mylist.add(data);
                }
                c.close();
                myadapter.notifyDataSetChanged();
            }
        });
    }
}