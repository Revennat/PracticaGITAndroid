package com.example.practicas.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.practicas.R
import com.example.practicas.ui.theme.AzulFrancia
import com.example.practicas.ui.theme.RojoFrancia
import com.example.practicas.ui.theme.RojoMexico
import com.example.practicas.ui.theme.VerdeMexico

val RombosShape = GenericShape { size, _ ->
    moveTo(size.width / 2f, 0f)
    lineTo(size.width, size.height / 2f)
    lineTo(size.width / 2f, size.height)
    lineTo(0f, size.height / 2f)
    close()
}

@Preview
@Composable
fun BanderaScreen(modifier: Modifier = Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja, caja1, caja2, caja3) = createRefs();
        val LnGd = createGuidelineFromStart(0.5f)

        Box(modifier.background(Color(0xFF009B3A)).constrainAs(caja) {
            linkTo(parent.start, parent.end)
            linkTo(parent.top, parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier.clip(RombosShape).background(Color(0xFFFEDF00)).size(300.dp).constrainAs(caja1) {
            linkTo(parent.start, parent.end)
            linkTo(parent.top, parent.bottom)
        })
        Box(modifier.clip(CircleShape).background(Color(0xFF002776)).size(180.dp).constrainAs(caja2) {
            linkTo(parent.start, parent.end)
            linkTo(parent.top, parent.bottom)
        })


    }
}