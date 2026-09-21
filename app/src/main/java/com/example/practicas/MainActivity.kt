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
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
    Column(modifier.fillMaxSize()) {
        Row(Modifier
            .fillMaxWidth()
            .weight(1.25f)
            .background(Color.Red)) { }
        Row(Modifier
            .fillMaxWidth()
            .weight(3f)
            .background(Color.Yellow)) {
            Box(Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.escudo_de_espa_a__mazonado_),
                    null,
                    Modifier.size(150.dp).align(Alignment.TopStart).offset(x = 50.dp, y = 20.dp)
                )
            }
        }
        Row(Modifier
            .fillMaxWidth()
            .weight(1.25f)
            .background(Color.Red)) { }
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