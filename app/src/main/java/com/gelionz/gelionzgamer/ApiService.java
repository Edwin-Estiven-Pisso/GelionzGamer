package com.gelionz.gelionzgamer;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/usuario/")
    Call<List<User>> getUser();

    @GET("api/usuario/")
    Call<List<User>> getUserUsername(@Query("username") String username);

    /*@Multipart
    @POST("api/usuario/")
    Call<User> insertUser(
            @Part("username") String username,
            @Part("email") String email,
            @Part("nombres") String nombres,
            @Part("apellidos") String apellidos,
            @Part("documento") String documento,
            @Part("celular") String celular,
            @Part("imagen") String imagen,
            @Part("usuario_activo") Boolean usuario_activo,
            @Part("rol_de_usuario") String rol_de_usuario,
            @Part("password") String password

    );*/

    @POST("api/usuario/")
    Call<User> insertUser(@Body UserPost user);

    @Multipart
    @PUT("api/usuario/")
    Call<User> updateUser(@Query("id") String id,
                          @Part("username") RequestBody username,
                          @Part("email") RequestBody email,
                          @Part("nombres") RequestBody nombres,
                          @Part("apellidos") RequestBody apellidos,
                          @Part("documento") RequestBody documento,
                          @Part("celular") RequestBody celular,
                          @Part("imagen") RequestBody imagen,
                          @Part("usuario_activo") RequestBody usuario_activo,
                          @Part("rol_de_usuario") RequestBody rol_de_usuario,
                          @Part("password") RequestBody password
    );

    @DELETE("api/usuario/")
    Call<User> eliminarUser(@Query("id") String id);
}
