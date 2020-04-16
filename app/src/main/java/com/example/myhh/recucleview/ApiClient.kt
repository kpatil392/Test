package com.example.myhh.recucleview

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


public class ApiClient{
    var BASE_URL = "http://velmm.com/apis/"
    private var retrofit: Retrofit? = null
    fun getClient(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
}