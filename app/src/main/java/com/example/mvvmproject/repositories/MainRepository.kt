package com.example.mvvmproject.repositories

import com.example.mvvmproject.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){


    fun getAllLives() = retrofitService.getAllLives()



}