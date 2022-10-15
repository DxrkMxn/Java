package com.example.fooddeliveryapp.interfaces;
import com.example.fooddeliveryapp.model.Empleado;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface CRUD {

    @GET("/consultar/{id}")
    Call<List<Empleado>> getOne(@Path("id")long id);

    @GET("/consultarAll")
    Call<List<Empleado>>getAll();

    @POST("/guardar")
    Call<Empleado> addEmpleado(@Body Empleado empleado);
}
