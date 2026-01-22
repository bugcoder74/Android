package com.example.ui_demo._1_Introduction

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.ui_demo.ui.theme.UI_DEMOTheme

class FakeMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UI_DEMOTheme { // Giving a theme to our project

                // Yaha se apna content aaega - call all your functions
                // setContent {  } hamara content set karta hai
                // uske andar ek theme bana h
                // usi tehme ke under hamara app chalega aur hamare ui functions call honge


            }
        }
    }
}

/**
 * You can see - only this much is the minimum code required - it is the boiler plate code
 */