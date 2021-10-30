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

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class Registro extends AppCompatActivity {

    //ATRIBUTOS
    EditText Nombre_De_Usuario,Nombres,Apellidos,CorreoElectronico,TipoUsuario,Contrasenia,ConfirmarContrasenia;
    Button btnRegistroUsuario;

    FirebaseDatabase database;// OBTENER LA INSTANCIA DE LA BASE DE DATOS
    DatabaseReference myRef; // OBTENER LA REFERENCIA

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        referenciar();
    }
        public void Registrar(){
        database = FirebaseDatabase.getInstance();//INICIALIZACIÓN DE FIREBASE
        myRef = database.getReference();

        //PASAMOS LOS DATOS DE LAS CAJAS DE TEXTO AL POJO JUEGOS Y LUEGO INSERTAMOS EL OBJETO EN FIREBASE

        Usuarios usuarios = new Usuarios();
        usuarios.setUsername(Nombre_De_Usuario.getText().toString());
        usuarios.setNombres(Nombres.getText().toString());
        usuarios.setApellidos(Apellidos.getText().toString());
        usuarios.setEmail(CorreoElectronico.getText().toString());
        usuarios.setRol_de_usuario(TipoUsuario.getText().toString());
        usuarios.setPassword(Contrasenia.getText().toString());
        usuarios.setConfirmarpassword(ConfirmarContrasenia.getText().toString());

        String id = UUID.randomUUID().toString(); //CREAR UN ID CON UN RANDOM

        myRef.child("Usuarios").child(id).setValue(usuarios);
        Intent intent= new Intent(Registro.this, MainActivity.class);
        Toast.makeText(this, "REGISTRO EXITOSO", Toast.LENGTH_SHORT).show();
    }

    public  void referenciar(){
        Nombre_De_Usuario=(EditText) findViewById(R.id.Nombre_De_Usuario);
        Nombres=(EditText) findViewById(R.id.Nombres);
        Apellidos=(EditText) findViewById(R.id.Apellidos);
        CorreoElectronico=(EditText) findViewById(R.id.CorreoElectronico);
        TipoUsuario=(EditText)findViewById(R.id.TipoUsuario);
        Contrasenia=(EditText) findViewById(R.id.Contraseña);
        ConfirmarContrasenia=(EditText) findViewById(R.id.ConfirmarContraseña);
        btnRegistroUsuario = (Button) findViewById(R.id.btnregistrarusuario);

/*        btnRegistroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Registro.this, MainActivity.class);
                Toast.makeText(Registro.this, "REGISTRO EXITOSO", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });*/
        btnRegistroUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrar();
            }
        });
    }
}