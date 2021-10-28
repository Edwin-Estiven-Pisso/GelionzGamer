package com.gelionz.gelionzgamer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
    TextView txtEventos;
    Button btnListar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);

        referenciar();

        btnListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listadoEventos();
            }
        });

    }

    public void referenciar(){
        txtEventos=findViewById(R.id.txtEventos);
        btnListar=findViewById(R.id.btnListar);

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
                    resultado += "Ganador: " + u.getGanador_evento() + "\n";
                    resultado += "Nro. Jugadores: " + u.getCantidad_jugadores() + "\n";
                    resultado += "Estado: " + u.getEstado() + "\n";
                    resultado += "Organizador: " + u.getOrganizador() + "\n";
                    txtEventos.append(resultado);
                }
                Log.e("lista", listaEventos.toString());
            }
            @Override
            public void onFailure(Call<List<Eventos2>> call, Throwable t) {

            }
        });
    }
}