package com.giuliana.evaluacioncontinuacuatro.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.giuliana.evaluacioncontinuacuatro.model.Rickimorti

@Database(entities=[Rickimorti::class],version=1)
abstract class RickimortiDatabase:RoomDatabase() {
    abstract fun rickimortiDao():RickimortiDao

    companion object{
        @Volatile
        private var instance:RickimortiDatabase?=null
        fun getDatabase(context: Context):RickimortiDatabase{
            if (instance==null){
                synchronized(this){
                    instance=buildDatabase(context)
                }
            }
            return instance!!
        }
        private fun buildDatabase(context: Context): RickimortiDatabase?{
            return Room.databaseBuilder(
                context.applicationContext,
                RickimortiDatabase::class.java,
                "rickimorti_database"
            ).build()
        }
    }
}