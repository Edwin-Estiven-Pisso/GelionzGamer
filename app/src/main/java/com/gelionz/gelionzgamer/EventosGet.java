package com.gelionz.gelionzgamer;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EventosGet {

    @GET("api/evento/")
    Call<List<Eventos2>> getEventos();


}
