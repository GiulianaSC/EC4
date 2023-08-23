package com.giuliana.evaluacioncontinuacuatro.view.fragments

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.giuliana.evaluacioncontinuacuatro.data.db.RickimortiDatabase
import com.giuliana.evaluacioncontinuacuatro.data.repository.RickiMortiRepository
import com.giuliana.evaluacioncontinuacuatro.model.ApiResponse
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti
import com.giuliana.evaluacioncontinuacuatro.model.getData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class RickiMortiFavoriteViewModel(application: Application): AndroidViewModel(application) {
    private val repository: RickiMortiRepository
    private val _favorites: MutableLiveData<List<Rickimorti>> =MutableLiveData()
    val favorites:LiveData<List<Rickimorti>> = _favorites
    init{
        val db=RickimortiDatabase.getDatabase(application)
        repository=RickiMortiRepository(db.rickimortiDao())
        refreshFavorites()
    }
    fun refreshFavorites() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = repository.getFavorites()
            withContext(Dispatchers.Main) {
                _favorites.value = data
            }
        }
    }
    fun addFavorite(rickimorti: Rickimorti) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addFavorite(rickimorti)
            refreshFavorites() // Actualizar la lista de favoritos después de agregar uno nuevo
        }
    }

    fun removeFavorite(rickimorti: Rickimorti) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.removeFavorite(rickimorti)
            refreshFavorites() // Actualiza la lista después de eliminar un favorito
        }
    }

    fun getFavorites() {
        viewModelScope.launch(Dispatchers.IO) {
            val data = repository.getFavorites()
            withContext(Dispatchers.Main) {
                _favorites.value = data
            }
        }
    }
}