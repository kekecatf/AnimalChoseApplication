package com.example.animalchoseapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.animalchoseapplication.ui.screens.FunFactsNavigationGraph
import com.example.animalchoseapplication.ui.screens.Routes
import com.example.animalchoseapplication.ui.screens.UserInputScreen
import com.example.animalchoseapplication.ui.screens.WelcomeScreen
import com.example.animalchoseapplication.ui.theme.AnimalChoseApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimalChoseApplicationTheme {
                FunFactsApp()
            }
        }
    }
}

@Composable
fun FunFactsApp() {
    FunFactsNavigationGraph()

}

