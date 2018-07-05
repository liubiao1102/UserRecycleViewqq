package com.example.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.holder.FirstHolder;
import com.example.thinkpad.userrecycleview.R;

import java.util.List;

public class FirstAdapter extends RecyclerView.Adapter<FirstHolder> {
    private Context context;
    private List<String> datas;

    public FirstAdapter(Context context, List<String> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public FirstHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FirstHolder(LayoutInflater.from(context).inflate(R.layout.firstitem_layout, null, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FirstHolder holder, int position) {
        holder.text_view.setText(datas.get(position));
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
