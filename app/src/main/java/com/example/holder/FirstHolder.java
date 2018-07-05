package com.example.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.thinkpad.userrecycleview.R;

public class FirstHolder extends RecyclerView.ViewHolder {

    public   TextView text_view;

    public FirstHolder(View itemView) {
        super(itemView);
        text_view = itemView.findViewById(R.id.text_view);
    }
}
