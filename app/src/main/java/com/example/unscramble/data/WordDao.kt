package com.example.unscramble.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface WordDao {

    @Insert
    suspend fun insertWord(word: Wordbaru)

    @Query("SELECT * FROM words")
    fun getAllWords(): Flow<List<Wordbaru>>

}