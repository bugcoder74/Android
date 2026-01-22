package com.example.ui_demo._3_CoreComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SimpleText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Hello Android",
            color = Color.Red,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(color = Color.Black, blurRadius = 28f)
            )
        )
    }
}

@Composable
fun ColorfulText(){
    val rainbowColors = listOf(
        Color.Blue,
        Color.Green,
        Color.Yellow,
        Color.Cyan,
        Color.Magenta,
        Color.DarkGray,
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                append("Hellow there, this is Harsh Dubey \n")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = rainbowColors
                        )
                    )
                ) {
                    append("And I love Android..")
                }
                append("\n And Backend is just awesome...")
            },
            fontSize = 30.sp
        )
    }
}

@Composable
fun ScrolledText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Rohit Sharma Creates the World Record with highest ever 264 runs..".repeat(50),
            fontSize = 50.sp,
            maxLines = 3,
            //modifier = Modifier.basicMarquee(),
            overflow = TextOverflow.Ellipsis //Adds a ... => Text is still left
        )
    }
}



@Preview(showSystemUi = true)
@Composable
fun PreviewDesign(){
    ScrolledText()
}