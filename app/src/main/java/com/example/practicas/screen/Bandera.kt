package com.example.practicas.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.practicas.R
import java.lang.reflect.Modifier

@Composable
fun BanderaScreen(modifier: Modifier, fillMaxSize: Modifier.() -> androidx.compose.ui.Modifier){
    Row(modifier = modifier.fillMaxSize()){
        Column(modifier = androidx.compose.ui.Modifier.fillMaxHeight().weight(2f).background(Color.Green)) { }
        Column(modifier = androidx.compose.ui.Modifier.fillMaxHeight().weight(2f).background(Color.White)) {
            Box(modifier = androidx.compose.ui.Modifier.fillMaxSize(), Alignment.Center) {
                Image(painter = painterResource(R.drawable.mexico_coat_of_arms), null)
            }
        }
        Column(modifier = androidx.compose.ui.Modifier.fillMaxHeight().weight(2f).background(Color.Red)) { }
    }
}