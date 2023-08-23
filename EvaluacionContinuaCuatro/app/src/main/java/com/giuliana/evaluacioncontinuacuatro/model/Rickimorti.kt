package com.giuliana.evaluacioncontinuacuatro.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Entity(tableName="rickimorti")
@Parcelize
data class Rickimorti(
    @PrimaryKey
    val id:Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status:String,
    @SerializedName("species")
    val species: String,
    @SerializedName("gender")
    val gender: String
):Parcelable

fun getData(): List<Rickimorti> {
    return listOf(
        Rickimorti(1,"","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti(2,"","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti(3,"","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti(4,"","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti(5,"","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti(6,"","Rick Sanchez","Alive","Human", "Male"),
        Rickimorti(7,"","Rick Sanchez","Alive","Human", "Male")
    )
}


