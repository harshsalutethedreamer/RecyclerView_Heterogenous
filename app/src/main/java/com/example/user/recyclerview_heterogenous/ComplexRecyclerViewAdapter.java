package com.example.user.recyclerview_heterogenous;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by user on 8/12/2017.
 */

public class ComplexRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Object> items;
    private final int USER=0,IMAGE=1;
    private Context context;

    public ComplexRecyclerViewAdapter(ArrayList<Object> items,Context context) {
        this.items = items;
        this.context=context;
    }

    @Override
    public int getItemViewType(int position) {
        Log.d("happy",Integer.toString(position));
        if(items.get(position) instanceof User){
            return USER;
        }else if(items.get(position) instanceof String){
            return IMAGE;
        }
        return -1;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater=LayoutInflater.from(context);
        switch(viewType){
            case USER:
                View v1=inflater.inflate(R.layout.layout_viewholder1,parent,false);
                viewHolder =new ViewHolder1(v1);
                break;
            case IMAGE:
                View v2=inflater.inflate(R.layout.layout_viewholder2,parent,false);
                viewHolder=new ViewHolder2(v2);
                break;
            default:
                View v=inflater.inflate(R.layout.simple_list_item_1,parent,false);
                viewHolder=new RecyclerViewSimpleTextViewHolder(v);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch(holder.getItemViewType()){
            case USER:
                ViewHolder1 vh1=(ViewHolder1) holder;
                configureViewHolder(vh1,position);
                break;
            case IMAGE:
                ViewHolder2 vh2=(ViewHolder2) holder;
                configureViewHolder2(vh2,position);
                break;
            default:
                RecyclerViewSimpleTextViewHolder vh=(RecyclerViewSimpleTextViewHolder) holder;
                configureDefaultViewHolder(vh,position);
        }
    }

    @Override
    public int getItemCount() {
        return this.items.size();
    }

    private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh,int position){
        vh.getTextView().setText((CharSequence) items.get(position));
    }

    private void configureViewHolder(ViewHolder1 vh1,int position){
        User user=(User)items.get(position);
        Log.d("happyme",((User)items.get(1)).getName());
        if(user!=null){
            vh1.getText1().setText("Name: "+user.getName());
            vh1.getText2().setText("Address: "+user.getAddress());
        }
    }

    private void configureViewHolder2(ViewHolder2 vh2,int position){
        vh2.getImageView().setImageResource(R.mipmap.ic_launcher);
    }
}
