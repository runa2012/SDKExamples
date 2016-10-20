package com.rewalk;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.transition.Fade;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.rewalk.Base.RewalkBaseActivity;

/**
 * Created by Administrator on 2016-07-27.
 */
public class intro extends RewalkBaseActivity {

    private ImageView IntroIcon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro);

        IntroIcon = (ImageView)findViewById(R.id.introicon);

        /**/
        IntroIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Transition fade = new Fade();
//                    fade.excludeTarget(android.R.id.statusBarBackground, true);
//                    fade.excludeTarget(android.R.id.navigationBarBackground, true);
//                    getWindow().setExitTransition(fade);
//                    getWindow().setEnterTransition(fade);
//                    getWindow().setExitTransition(null);
//                    getWindow().setEnterTransition(null);

                    Intent d = new Intent(intro.this, MainActivity.class);
                    ActivityOptions s = ActivityOptions.makeSceneTransitionAnimation(intro.this, IntroIcon, "introicon");
                    startActivity(d ,s.toBundle());
                }else{
                    Intent d = new Intent(intro.this, MainActivity.class);
                    startActivity(d);
                }
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}
