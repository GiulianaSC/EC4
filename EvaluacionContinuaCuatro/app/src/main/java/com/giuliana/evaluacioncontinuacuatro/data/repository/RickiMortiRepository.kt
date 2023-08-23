package com.giuliana.evaluacioncontinuacuatro.data.repository

import com.giuliana.evaluacioncontinuacuatro.data.db.RickimortiDao
import com.giuliana.evaluacioncontinuacuatro.data.response.RickiMortiFavoriteResponse
import com.giuliana.evaluacioncontinuacuatro.data.response.RickiMortiListResponse
import com.giuliana.evaluacioncontinuacuatro.data.retrofit.ServiceInstance
import com.giuliana.evaluacioncontinuacuatro.model.ApiResponse
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti


class RickiMortiRepository(val rickimortiDao:RickimortiDao?=null) {

    suspend fun getRickiMorti(): ApiResponse<RickiMortiListResponse> {
        return try{
            val response= ServiceInstance.getRickiMortiService().getRickiMorti()
            ApiResponse.Success(response)
        }catch(e: Exception){
            ApiResponse.Error(e)
        }
    }
    suspend fun addFavorite(rickimorti:Rickimorti){
        rickimortiDao?.let{
            it.addFavorite(rickimorti)
        }
    }
    fun getFavorites():List<Rickimorti>{
        rickimortiDao?.let{
            return it.getFavorites()
        }?:kotlin.run{
            return listOf()
        }
    }
    suspend fun removeFavorite(rickimorti: Rickimorti) {
        rickimortiDao?.let {
            it.deleteFavorite(rickimorti)
        }
    }
}