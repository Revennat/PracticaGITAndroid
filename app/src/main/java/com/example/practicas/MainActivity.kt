package com.example.practicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.practicas.ui.theme.PracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    banderaEspaña(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun banderaEspaña(modifier: Modifier = Modifier) {

    Box {
        Column(modifier.fillMaxSize()) {
            Row(Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF74ACDF))) { }
            Row(Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.White)) {
            }
            Row(Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color(0xFF74ACDF))) { }
        }
        Box(
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .background(Color(0xFFF6B40E))
                .align(Alignment.Center)
        )
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