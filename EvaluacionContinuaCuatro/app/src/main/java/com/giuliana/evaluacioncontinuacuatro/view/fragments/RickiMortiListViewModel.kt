package com.giuliana.evaluacioncontinuacuatro.view.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.giuliana.evaluacioncontinuacuatro.data.repository.RickiMortiRepository
import com.giuliana.evaluacioncontinuacuatro.model.ApiResponse
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti
import com.giuliana.evaluacioncontinuacuatro.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RickiMortiListViewModel:ViewModel() {
    val repository= RickiMortiRepository()
    val rickimortiList:MutableLiveData<List<Rickimorti>> =MutableLiveData<List<Rickimorti>>()

    fun getRickiMortiList(){
        val data= getData()
        rickimortiList.value =data
    }
    fun getRickiMortiFromService(){
        viewModelScope.launch(Dispatchers.IO){
            val response=repository.getRickiMorti()
            when(response){
                is ApiResponse.Error -> {

                }
                is ApiResponse.Success -> {
                    rickimortiList.postValue(response.data.results)
                }
            }
        }
    }
}