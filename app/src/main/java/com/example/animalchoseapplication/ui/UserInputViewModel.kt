package com.example.animalchoseapplication.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.animalchoseapplication.data.UserDataUiEvents
import com.example.animalchoseapplication.data.UserInputScreenState

class UserInputViewModel:ViewModel() {
    var uiState= mutableStateOf(UserInputScreenState())
    fun onEvent(event: UserDataUiEvents){
        when(event){
            is UserDataUiEvents.UserNameEntered->{
                uiState.value= uiState.value.copy(
                    nameEntered = event.name
                )
            }
            //37.32 youtube
            is UserDataUiEvents.AnimalSelected->{
                uiState.value=uiState.value.copy(
                    animalSelected = event.animalValue
                )
            }
        }
    }
}




