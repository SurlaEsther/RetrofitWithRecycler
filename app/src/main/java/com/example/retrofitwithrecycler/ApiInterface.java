package com.example.retrofitwithrecycler;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface
{

    //@GET("v3/015e86d5-a173-4c6b-a902-f43609b30f0d")
    @GET("v3/c327feac-e664-4df7-a40d-68b6c72cd274")

    Call<List<Movie>> getMovies();
}
