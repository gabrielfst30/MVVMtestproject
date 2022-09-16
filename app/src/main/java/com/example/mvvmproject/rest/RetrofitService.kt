package com.example.mvvmproject.rest

import com.example.mvvmproject.models.Live
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitService {

    @GET("lista-lives.json") //PEGANDO O PATH (CAMINHO)
    fun getAllLives() : Call<List<Live>>

    companion object {

        //by lazy instancia o objeto uma vez só e quando ele for inicializado
        private val retrofitService: RetrofitService by lazy {

            //construindo o retrofit e convertendo a url em gson
                val retrofit = Retrofit.Builder()
                    .baseUrl("https:/d3c0cr0sze1oo6.cloudfront.net/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            //retrofit criado
                retrofit.create(RetrofitService::class.java)
        }

        fun getInstance() : RetrofitService{
            return retrofitService
        }

    }


}