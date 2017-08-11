package com.example.user.recyclerview_heterogenous;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by user on 8/12/2017.
 */

public class ViewHolder1 extends RecyclerView.ViewHolder{
    private TextView text1,text2;

    public ViewHolder1(View itemView) {
        super(itemView);
        text1=(TextView)itemView.findViewById(R.id.text1);
        text2=(TextView)itemView.findViewById(R.id.text2);
    }

    public TextView getText1() {
        return text1;
    }

    public TextView getText2() {
        return text2;
    }

    public void setText1(TextView text1) {
        this.text1 = text1;
    }

    public void setText2(TextView text2) {
        this.text2 = text2;
    }
}
