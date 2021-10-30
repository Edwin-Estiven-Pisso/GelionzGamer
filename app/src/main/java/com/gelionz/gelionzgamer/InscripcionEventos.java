package com.gelionz.gelionzgamer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class InscripcionEventos extends AppCompatActivity {

    ImageButton imgPerfil;
    Button btnInicio, btnEventos, btnInscripción, btnContactanos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscripcion_eventos);

        referenciar();
    }


    public void referenciar(){

        imgPerfil=findViewById(R.id.imgperfil);
        btnInicio=findViewById(R.id.btnInicio);
        btnEventos=findViewById(R.id.btnEventos);
        btnInscripción=findViewById(R.id.btnInscripción);
        btnContactanos=findViewById(R.id.btnContactanos);

        //NAVEGACIÓN ENTRE MODULOS DE LA APLICACIÓN
        imgPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InscripcionEventos.this,Perfil.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InscripcionEventos.this,Menu.class);
                startActivity(intent);
            }
        });

        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InscripcionEventos.this,Eventos.class);
                startActivity(intent);
            }
        });

        btnContactanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InscripcionEventos.this,Contactanos.class);
                startActivity(intent);
            }
        });

        btnInscripción.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(InscripcionEventos.this,InscripcionEventos.class);
                startActivity(intent);
            }
        });
    }



}