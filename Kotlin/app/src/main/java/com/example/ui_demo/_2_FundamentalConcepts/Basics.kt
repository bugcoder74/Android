package com.example.ui_demo._2_FundamentalConcepts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// Topic 1 : What is the Composable Function

@Composable
fun Greeting(){

    Text ( text= "Hello world" )

}

// If you want the preview of above function, you have two option
// 1. Run the app and see
// 2. To have a preview - do this :

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    Greeting()
}