package com.example.projekakhirlaura.api

import com.example.projekakhirlaura.ResponsePantai
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("get-pantai")
    fun getDetail1 () : Call<ResponsePantai>
}