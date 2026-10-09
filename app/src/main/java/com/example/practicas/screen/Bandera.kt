package com.example.practicas.screen

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
import androidx.compose.ui.graphics.Path
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


@Preview
@Composable
fun BanderaTuquia(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        drawRect(color = Color(0xFFE30A17))
        val cy = size.height / 2f
        val rOut = size.height * 0.3f

        drawCircle(
            color = Color.White,
            radius = rOut,
            center = Offset(size.width * 0.38f, cy)
        )
        drawCircle(
            color = Color(0xFFE30A17),
            radius = size.height * 0.24f,
            center = Offset(size.width * 0.38f + size.height * 0.09f, cy)
        )

        // Estrella: Path con 10 puntos (5 externos, 5 internos)
        val starCenter = Offset(size.width * 0.70f, cy)
        val outerRadius = size.height * 0.12f
        val innerRadius = outerRadius * 0.382f // Proporción clásica para la estrella de 5 puntas
        val startAngle = -PI / 2.0 // Inicia hacia la izquierda (apuntando a la luna)

        val starPath = Path().apply {
            for (i in 0 until 10) {
                val radius = if (i % 2 == 0) outerRadius else innerRadius
                val angle = startAngle + i * (PI / 5.0)

                val x = (starCenter.x + radius * cos(angle)).toFloat()
                val y = (starCenter.y + radius * sin(angle)).toFloat()

                if (i == 0) moveTo(x, y) else lineTo(x, y)
            }
            close()
        }

        drawPath(path = starPath, color = Color.White)
    }
}

