package com.example.animalchoseapplication.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.animalchoseapplication.data.UserInputScreenState

class UserInputViewModel:ViewModel() {
    var uiState= mutableStateOf(UserInputScreenState())
}



