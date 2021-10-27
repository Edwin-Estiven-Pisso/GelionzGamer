package com.gelionz.gelionzgamer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
    }

/*    public void listarUsuarios(){
        Retrofit retorfit = new Retrofit.Builder()
                .baseUrl("https://gelionz.herokuapp.com/webservices/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiService userService = retorfit.create(ApiService.class);
        Call<List<User>> lista = userService.getUser();
        lista.enqueue(new Callback<List<User>>() {


            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                listaUsuarios = response.body();
                for(User u: listaUsuarios){
                    String resultado = "";
                    resultado+= "Usuario: " + u.getUsername() + "\n";
                    resultado+= "Email: " + u.getEmail() + "\n";
                    resultado+= "Nombres: " + u.getNombres() + "\n";
                    resultado+= "Apellidos: " + u.getApellidos() + "\n";
                    resultado+= "Documento: " + u.getDocumento() + "\n";
                    resultado+= "Celular: " + u.getCelular() + "\n";
                    resultado+= "Genero: " + u.getGenero() + "\n";
                    resultado+= "Rol: " + u.getRol_de_usuario() + "\n";
                    txtresultado.append(resultado);
                }
                Log.e("lista",listaUsuarios.toString());
            }
            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
            }
        });*/
}