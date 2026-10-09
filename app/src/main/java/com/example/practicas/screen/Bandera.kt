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
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntSize
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


@Preview
@Composable
fun PixelArtENE(modifier: Modifier = Modifier) {
// 1. Paleta de colores exacta de la imagen
    val paleta = mapOf(
        '.' to Color.Transparent,
        'B' to Color(0xFF2552A8),
        'L' to Color(0xFF55E6ED),
        'G' to Color(0xFF2F3136),
        'W' to Color(0xFFFFFFFF),
        'R' to Color(0xFFF48EA3)
    )

    // 2. Matriz de 32x24 mapeando la figura
    val sprite = listOf(
        "................................",
        "...BBB.BB..BB..BBB.BB..B........",
        "...B...B.B.B.B.B.B.B.B.B........",
        "...B...B.B.B.B.B.B.B.B.B........",
        "...BBB.B.B.B.B.B.B.B.B.B........",
        "...B...B.B.B.B.B.B.B.B.B........",
        "...B...BB..BB..B.B.BB..........",
        "...BBB.B.B.B.B.BBB.B.B.B........",
        "................................",
        "................................",
        "............B...................",
        ".....BBBB...BB..BBBB.............",
        "....BBBBBBBBBBBBBBBBB...........",
        "....BBBBBBBBBBBBBBBBB..........",
        "...BBBBBBBBBBBWBBBBBBB..........",
        "...BBBBBWWBBBWWWBBBBBB..........",
        "..BBB.BWBWWBBWWBWBBB.BB.........",
        "..BB.BBWWBWBWWBWWBBB.BB.........",
        "..BB.BBWBWRRRRWBWGB..BB.........",
        "..BBB.GWLWWRRWLLWG...BB.........",
        "...B....WLWWWWLW.....B........",
        "....B...............B...........",
        "................................",
        "................................"
    )

    Canvas(modifier = modifier.fillMaxSize()) {
        val rows = sprite.size
        val cols = sprite.maxOf { it.length }

        val pixelSize = minOf(size.width / cols, size.height / rows)

        val offsetX = (size.width - (cols * pixelSize)) / 2f
        val offsetY = (size.height - (rows * pixelSize)) / 2f

        for (r in 0 until rows) {
            val rowText = sprite[r].padEnd(cols, '.')
            for (c in 0 until cols) {
                val charColor = rowText[c]
                val color = paleta[charColor] ?: Color.Transparent

                if (color != Color.Transparent) {
                    drawRect(
                        color = color,
                        topLeft = Offset(
                            x = offsetX + (c * pixelSize),
                            y = offsetY + (r * pixelSize)
                        ),
                        size = Size(pixelSize, pixelSize)
                    )
                }
            }
        }
    }
}



