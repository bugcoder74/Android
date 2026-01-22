package com.example.ui_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_demo._2_FundamentalConcepts.AccessImageResource
import com.example.ui_demo._2_FundamentalConcepts.AccessStringResource
import com.example.ui_demo._2_FundamentalConcepts.Greeting
import com.example.ui_demo.ui.theme.UI_DEMOTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI_DEMOTheme { // Giving a theme to our project

                // Whatever you want to call comes here

                //Greeting()
                AccessStringResource()
                AccessImageResource()



            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true) // When you click preview in Android Studio - this fn. will be shown
@Composable
fun GreetingPreview() {
    UI_DEMOTheme {
        Greeting("Android")
    }
}