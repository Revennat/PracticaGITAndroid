package com.example.practicas.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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

@Preview
@Composable
fun BanderaScreen(modifier: Modifier = Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (caja, caja1, caja2, caja3) = createRefs();
        val LnGd = createGuidelineFromTop(0.4f)

        Box(modifier.background(AzulFrancia).constrainAs(caja) {
            linkTo(parent.start, caja1.start)
            linkTo(parent.top, parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier.background(Color.White).constrainAs(caja1) {
            linkTo(caja.end, caja2.start)
            linkTo(parent.top, parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
        Box(modifier.background(RojoFrancia).constrainAs(caja2) {
            linkTo(caja1.end, parent.end)
            linkTo(parent.top, parent.bottom)
            width = Dimension.fillToConstraints
            height = Dimension.fillToConstraints
        })
    }
}