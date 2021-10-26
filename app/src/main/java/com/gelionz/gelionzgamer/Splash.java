package com.gelionz.gelionzgamer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    ImageView Splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Splash=findViewById(R.id.img_splash);
        startSplash();
    }
    private void startSplash() {

        Thread duracion=new Thread(){
            public void run(){
                try {
                    sleep(1500);
                }catch (InterruptedException e){
                    Log.i("Error en Splash", String.valueOf(e));
                }finally {
                    Intent intent=new Intent(Splash.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };duracion.start();
    }
}