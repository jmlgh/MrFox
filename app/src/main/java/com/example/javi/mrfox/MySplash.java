package com.example.javi.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity {

    TextView tvMrFox;
    ImageView ivMrFox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);

        initViews();
        setTypeFace();
        animate();
    }

    private void animate() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotar);
        Animation animationLetras = AnimationUtils.loadAnimation(this, R.anim.anim_letra);
        ivMrFox.startAnimation(animation);
        tvMrFox.startAnimation(animationLetras);
        openApp(true);
    }

    private void openApp(boolean b) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MySplash.this, MyLogin.class);
                startActivity(i);
                finish();
            }
        }, 3500);
    }

    private void initViews() {
        tvMrFox = (TextView) findViewById(R.id.tv_mrfox);
        ivMrFox = (ImageView) findViewById(R.id.iv_mrfox);
    }

    private void setTypeFace() {
        Typeface fuenteMrFox = Typeface.createFromAsset(getAssets(), "fonts/AmaticSC-Regular.ttf");
        tvMrFox.setTypeface(fuenteMrFox);
    }
}
