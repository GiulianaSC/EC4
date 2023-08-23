package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.giuliana.evaluacioncontinuacuatro.data.db.RickimortiDatabase
import com.giuliana.evaluacioncontinuacuatro.data.repository.RickiMortiRepository
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RickimortiDetailViewModel(application: Application): AndroidViewModel(application) {
    private val repository: RickiMortiRepository
    init{
        val db= RickimortiDatabase.getDatabase(application)
        repository=RickiMortiRepository(db.rickimortiDao())
    }
    fun addFavorite(rickimorti: Rickimorti){
        viewModelScope.launch(Dispatchers.IO) {
            repository.addFavorite(rickimorti)
        }
    }
    fun removeFavorite(rickimorti: Rickimorti) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.removeFavorite(rickimorti)
        }
    }
}