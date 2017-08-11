package com.example.user.recyclerview_heterogenous;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 8/12/2017.
 */

public class RecyclerViewSimpleTextViewHolder extends RecyclerView.ViewHolder{

    public TextView textView;

    public RecyclerViewSimpleTextViewHolder(View itemView) {
        super(itemView);
        textView=(TextView)itemView.findViewById(R.id.simple_text);
    }

    public TextView getTextView() {
        return textView;
    }
}
