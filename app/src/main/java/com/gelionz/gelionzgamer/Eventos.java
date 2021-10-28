package com.gelionz.gelionzgamer;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Eventos extends AppCompatActivity {

    List<Eventos2> listaEventos = new ArrayList<>();
    ImageButton imgPerfil;
    Button btnInicio, btnEventos, btnInscripción, btnContactanos;
    TextView txtListaEventos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        referenciar();

        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listadoEventos();
            }
        });

    }

    public void referenciar(){

        txtListaEventos=findViewById(R.id.txtListaEventos);
        imgPerfil=findViewById(R.id.imgperfil);
        btnInicio=findViewById(R.id.btnInicio);
        btnEventos=findViewById(R.id.btnEventos);
        btnInscripción=findViewById(R.id.btnInscripción);
        btnContactanos=findViewById(R.id.btnContactanos);


        //NAVEGACIÓN ENTRE MODULOS DE LA APLICACIÓN
        imgPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Eventos.this,Perfil.class);
                startActivity(intent);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Eventos.this,Menu.class);
                startActivity(intent);
            }
        });

        btnEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Eventos.this,Eventos.class);
                startActivity(intent);
            }
        });

        btnContactanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Eventos.this,Contactanos.class);
                startActivity(intent);
            }
        });

        btnInscripción.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Eventos.this,InscripcionEventos.class);
                startActivity(intent);
            }
        });
    }

    public void listadoEventos(){
        Retrofit retorfit = new Retrofit.Builder()
                .baseUrl("https://gelionz.herokuapp.com/webservices/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EventosGet eventosGet = retorfit.create(EventosGet.class);
        Call<List<Eventos2>> lista = eventosGet.getEventos();
        lista.enqueue(new Callback<List<Eventos2>>() {
            @Override
            public void onResponse(Call<List<Eventos2>> call, Response<List<Eventos2>> response) {
                listaEventos = response.body();
                for (Eventos2 u : listaEventos) {
                    String resultado = "";
//                  resultado += "Id: " + u.getId() + "\n";
                    resultado += "Tipo Evento: " + u.getTipo_evento() + "\n";
                    resultado += "Fecha: " + u.getFecha_hora_evento() + "\n";
                    resultado += "Valor Evento" + u.getValor_evento() + "\n";
                    resultado += "Ganador: " + u.getGanador_evento() + "\n";
                    resultado += "Nro. Jugadores: " + u.getCantidad_jugadores() + "\n";
                    resultado += "Estado: " + u.getEstado() + "\n";
                    resultado += "Organizador: " + u.getOrganizador() + "\n";
                    txtListaEventos.append(resultado);
                }
                Log.e("lista", listaEventos.toString());
            }
            @Override
            public void onFailure(Call<List<Eventos2>> call, Throwable t) {

            }
        });
    }
}