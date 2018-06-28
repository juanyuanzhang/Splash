package com.example.administrator.splsh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class Splash_Activity extends AppCompatActivity {
    LinearLayout logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_);
        Animation fadIn = AnimationUtils.loadAnimation(this,R.anim.fad_in);
       // Animation translate = AnimationUtils.loadAnimation(this,R.anim.translate);
        logo = findViewById(R.id.logo);
        logo.setAnimation(fadIn);


        Thread timer = new Thread(){
            @Override
            public void run() {
                super.run();
                try{
                    sleep(5000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    startActivity(new Intent(Splash_Activity.this,MainActivity.class));
                }
            }
        };
        timer.start();
    }
}
