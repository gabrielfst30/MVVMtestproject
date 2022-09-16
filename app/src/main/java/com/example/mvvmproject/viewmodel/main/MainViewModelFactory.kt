package com.example.mvvmproject.viewmodel.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmproject.repositories.MainRepository
import java.lang.IllegalArgumentException

class MainViewModelFactory constructor(private val repository: MainRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T{
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)){
            MainViewModel(this.repository) as T
        } else{
            throw IllegalArgumentException("ViewModel Not Found")
        }
    }


}