package com.example.thuchanhcuoiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_thuoc extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Thuoc> arraylist;

    public Adapter_thuoc(Context context, int layout, List<Thuoc> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }



    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        Thuoc monan = arraylist.get(position);

        TextView text1 = view.findViewById(R.id.tentacgia);
        TextView text2 = view.findViewById(R.id.namsinh);
        TextView text3 = view.findViewById(R.id.quequan);
        ImageView imageV = view.findViewById(R.id.imageHinh);

        text1.setText(monan.getTentacgia());
        text2.setText(monan.getNamsinh());
        text3.setText(monan.getQuequan());
        imageV.setImageResource(monan.getHinh());

        return view;
    }
}
