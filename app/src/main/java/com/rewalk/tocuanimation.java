package com.rewalk;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.Transition;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by Administrator on 2016-07-27.
 */
public class tocuanimation extends AppCompatActivity {
    private ImageView myView ,myView1 ,myView3;
    private RelativeLayout layout1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        layout1 = (RelativeLayout)findViewById(R.id.layout1);
        myView1 = (ImageView)findViewById(R.id.testid);
        myView3 = (ImageView)findViewById(R.id.testid3);
        myView = (ImageView)findViewById(R.id.testid2);

        myView1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    if ( myView.getVisibility() == View.GONE ) {
                        int finalRadius = Math.max(layout1.getWidth(), layout1.getHeight());
                        Animator anim = ViewAnimationUtils.createCircularReveal(myView, (int) motionEvent.getX(), (int) motionEvent.getY(), 0, finalRadius);
                        myView.setVisibility(View.VISIBLE);
                        anim.start();
                    }else {
                        int initialRadius = myView.getWidth();
                        Animator anim = ViewAnimationUtils.createCircularReveal(myView, (int) motionEvent.getX(), (int) motionEvent.getY() , initialRadius, 0);
                        anim.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animation) {
                                super.onAnimationEnd(animation);
                                myView.setVisibility(View.GONE);
                            }
                        });
                        anim.start();
                    }
                }

                return false;
            }
        });


        myView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ( Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    Intent d = new Intent(tocuanimation.this, RecyclerViewTEST.class);
                    ActivityOptions s = ActivityOptions.makeSceneTransitionAnimation(tocuanimation.this);
                    startActivity(d, s.toBundle());
                }
            }
        });

    }



}
