package com.example.practicas.screen

import androidx.annotation.ColorRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practicas.R
import com.example.practicas.ui.theme.AzulFrancia
import com.example.practicas.ui.theme.RojoFrancia
import com.example.practicas.ui.theme.RojoMexico
import com.example.practicas.ui.theme.VerdeMexico
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


@Preview
@Composable
fun PixelArtDirecto() {
    val pixelSize: Dp = 12.dp

    // Colores
    val azul = Color(0xFF2552A8)
    val blanco = Color.White
    val negro = Color(0xFF2F3136)
    val rosa = Color(0xFFF48EA3)
    val cian = Color(0xFF55E6ED)
    val crema = Color(0xFFFFF2C6)

    @Composable
    fun Pixel(color: Color) {
        Box(
            modifier = Modifier
                .size(pixelSize)
                .background(color)
        )
    }

    Column {
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(azul); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(azul);Pixel(azul); Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White);Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul);Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul);Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(azul);Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul);Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul);Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul);Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(azul);Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White);
        }
        Row {
            Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(azul); Pixel(azul);Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(Color.White);Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(azul); Pixel(azul);
        }
        Row {
            Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(azul); Pixel(azul);Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(Color.White);Pixel(azul); Pixel(Color.White); Pixel(Color.White); Pixel(negro); Pixel(azul); Pixel(Color.White); Pixel(azul); Pixel(azul);
        }
        Row {
            Pixel(azul); Pixel(azul); Pixel(azul); Pixel(Color.White); Pixel(negro);Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(rosa); Pixel(rosa); Pixel(rosa); Pixel(rosa);Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(negro); Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(azul);
        }
        Row {
            Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(cian); Pixel(cian); Pixel(Color.White); Pixel(rosa); Pixel(rosa); Pixel(Color.White);Pixel(cian); Pixel(cian); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(cian);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(cian); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(azul); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);
        }
        Row {
            Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White); Pixel(Color.White);
        }
    }
}



