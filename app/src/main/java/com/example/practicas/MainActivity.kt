package com.example.practicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.practicas.ui.theme.PracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BanderaItalia(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BanderaItalia(modifier: Modifier = Modifier) {
    Row(modifier.fillMaxSize()) {
        Column(Modifier.fillMaxHeight().weight(2f).background(Color.Green)) { }
        Column(Modifier.fillMaxHeight().weight(2f).background(Color.White)) { }
        Column(Modifier.fillMaxHeight().weight(2f).background(Color.Red)) { }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticasTheme {
        Greeting("Android")
    }
}
 */