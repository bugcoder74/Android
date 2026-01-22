package com.example.ui_demo._3_CoreComponents

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun SimpleOutlinedTextFieldSample(){

    var text by remember { //
        mutableStateOf("")
    }


}