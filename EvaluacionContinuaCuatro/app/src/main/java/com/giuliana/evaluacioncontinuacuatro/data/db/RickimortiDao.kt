package com.giuliana.evaluacioncontinuacuatro.data.db

import androidx.room.*
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti


@Dao
interface RickimortiDao {
    @Query("SELECT * from rickimorti")
    fun getFavorites():List<Rickimorti>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addFavorite(rickimorti: Rickimorti)

    @Delete
    suspend fun deleteFavorite(rickimorti: Rickimorti)
}