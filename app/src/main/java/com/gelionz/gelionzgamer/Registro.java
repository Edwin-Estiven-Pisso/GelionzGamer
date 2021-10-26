package com.gelionz.gelionzgamer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    //ATRIBUTOS
    EditText Nombre_De_Usuario,Nombres,Apellidos,CorreoElectronico,Contraseña,ConfirmarContraseña;
    Button btnRegistroUsuario;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        referenciar();
    }

    public  void referenciar(){
        Nombre_De_Usuario=(EditText) findViewById(R.id.Nombre_De_Usuario);
        Nombres=(EditText) findViewById(R.id.Nombres);
        Apellidos=(EditText) findViewById(R.id.Apellidos);
        CorreoElectronico=(EditText) findViewById(R.id.CorreoElectronico);
        spinner=findViewById(R.id.spinner_tipo_usuario);
        Contraseña=(EditText) findViewById(R.id.Contraseña);
        ConfirmarContraseña=(EditText) findViewById(R.id.ConfirmarContraseña);
        btnRegistroUsuario = (Button) findViewById(R.id.btnregistrarusuario);

        btnRegistroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Registro.this, MainActivity.class);
                Toast.makeText(Registro.this, "REGISTRO EXITOSO", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        //CONFIGURACIÓN DEL SPINER
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,
                R.array.Tipo_Usuario, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
    }
}