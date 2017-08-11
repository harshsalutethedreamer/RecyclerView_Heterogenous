package com.example.user.recyclerview_heterogenous;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //This guide explain how to inflate multiple view types inside your RecyclerView widget based on the item type

    RecyclerView recyclerView;
    ComplexRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView_complex);
        adapter=new ComplexRecyclerViewAdapter(getSampleArrayList(),this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Object> getSampleArrayList(){
        ArrayList<Object> items=new ArrayList<>();
        items.add(new User("Dany Ham","Valvaria"));
        items.add(new User("Harsh Gupta","Winterfall"));
        items.add("image");
        items.add(new User("Jon Snow","Castle Black"));
        items.add("image");
        items.add(new User("Tyrion Lanister","King's Landing"));
        Log.d("happymex",((User)items.get(1)).getName());
        return items;
    }
}
