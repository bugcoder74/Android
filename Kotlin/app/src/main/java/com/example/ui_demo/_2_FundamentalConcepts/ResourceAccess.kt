package com.example.ui_demo._2_FundamentalConcepts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.ui_demo.R


@Composable
fun AccessStringResource(){
    Box(
        modifier = Modifier.fillMaxSize(), // Gives the box the full size (i.e. takes entire screen)
        contentAlignment = Alignment.Center // Contents of the box aligned to the center
    ){
        Text(text="Hellow "+ stringResource(R.string.author)+", Welcome", color= colorResource(R.color.teal_200)) // R denotes the Resource folder
    }
}

//@Preview(showSystemUi = true)
//@Composable
//fun PreviewAccessStringResource(){
//    AccessStringResource()
//}


@Composable
fun AccessImageResource(){
    Box(
        modifier = Modifier.fillMaxWidth().fillMaxHeight(0.5f),
        contentAlignment = Alignment.Center
        

    ){
        Image(painter = painterResource(R.drawable.avatar3), contentDescription = "An Avatar")
    }
}