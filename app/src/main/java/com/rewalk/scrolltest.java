package com.rewalk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016-07-28.
 */
public class scrolltest extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrolltest);

        CollapsingToolbarLayout collapsingToolbarLayout =
                (CollapsingToolbarLayout) findViewById(R.id.main_collapsing);

        collapsingToolbarLayout.setTitle(getString(R.string.app_name));
    }

    public static void start(Context c) {
        c.startActivity(new Intent(c, scrolltest.class));
    }
}
