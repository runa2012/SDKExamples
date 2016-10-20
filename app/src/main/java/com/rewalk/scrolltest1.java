package com.rewalk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Administrator on 2016-07-28.
 */
public class scrolltest1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrolltest1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.ioexample_toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public static void start(Context c) {
        c.startActivity(new Intent(c, scrolltest1.class));
    }
}
