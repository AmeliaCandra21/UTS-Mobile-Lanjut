package com.example.unscramble.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.unscramble.data.WordDao
import com.example.unscramble.ui.GameViewModel

class GameViewModelFactory (private val WordDao: WordDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return  GameViewModel(WordDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}