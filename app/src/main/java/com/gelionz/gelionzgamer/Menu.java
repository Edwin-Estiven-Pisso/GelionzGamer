package com.gelionz.gelionzgamer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

public class Menu extends AppCompatActivity {

    ImageButton imgperfil;
    Button btnInicio, btnEventos, btnInscripción, btnContactanos;
    android.widget.VideoView VideoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ////////CODIGO DEL VIDEO////////////////
        VideoView = (android.widget.VideoView) findViewById(R.id.videoIntroductorio);
        VideoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.gelionz)); //AQUI LE DAMOS LA DIRECCION DEL VIDEO
        MediaController mediaController = new MediaController(this);
        VideoView.setMediaController(mediaController);
        VideoView.start();

        referenciar();
    }

    public void referenciar(){
        imgperfil=findViewById(R.id.imgperfil);
        btnInicio=findViewById(R.id.btnInicio);
        btnEventos=findViewById(R.id.btnEventos);
        btnContactanos=findViewById(R.id.btnContactanos);
        btnInscripción=findViewById(R.id.btnInscripción);

        imgperfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this,Perfil.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this,Menu.class);
                startActivity(intent);
            }
        });

        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this,Eventos.class);
                startActivity(intent);
            }
        });

        btnContactanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this,Contactanos.class);
                startActivity(intent);
            }
        });

        btnInscripción.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menu.this,InscripcionEventos.class);
                startActivity(intent);
            }
        });
    }
}