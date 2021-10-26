package com.gelionz.gelionzgamer;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText CorreoInicio, ContraseñaInicio;
    Button btnIngresar, btnRegistrarse, btnOlvidasteContraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referenciar();
    }

    public void referenciar(){
/*        CorreoInicio=findViewById(R.id.CorreoInicio);
        ContraseñaInicio=findViewById(R.id.ContraseñaInicio);*/
        btnIngresar=findViewById(R.id.btnIngresar);
        btnRegistrarse=findViewById(R.id.btnRegistrarse);
        btnOlvidasteContraseña=findViewById(R.id.btnOlvidastecontraseña);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Menu.class);
                Toast.makeText(MainActivity.this, "INGRESANDO...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Registro.class);
                startActivity(intent);
            }
        });
    }
}