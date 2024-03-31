package com.example.animalchoseapplication.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.animalchoseapplication.ui.TextComponent
import com.example.animalchoseapplication.ui.TopBar

@Composable
fun UserInputScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(18.dp))
        {
            TopBar("Hi there \uD83D\uDE0A")

            TextComponent(
                textValue = "Let's learn about you !",
                textSize = 24.sp)

            Spacer(modifier = Modifier.size(20.dp))

            TextComponent(
                textValue = "This app will prepare a details based on input provided by you !",
                textSize = 18.sp)
            Spacer(modifier = Modifier.size(60.dp))
        }
    }
}

@Preview
@Composable
fun UserInputScreenPreview(){
    UserInputScreen()
}