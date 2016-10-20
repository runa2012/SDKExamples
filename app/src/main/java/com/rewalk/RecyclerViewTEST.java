package com.rewalk;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.rewalk.Adapter.RecyclerViewAdapter;

/**
 * Created by Administrator on 2016-07-27.
 */
public class RecyclerViewTEST extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerviewtest);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        String s[] = {"dd","dd","dd","dd","dd","dd","dd","dd","dd","dd","dd","dd","dd","dd","dd","dd"};

        mAdapter = new RecyclerViewAdapter(s);
        mRecyclerView.setAdapter(mAdapter);
    }
}