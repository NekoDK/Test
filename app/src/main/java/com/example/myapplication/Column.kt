package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun FullList(onClick: () -> Unit){
    Image(
        modifier = Modifier.fillMaxSize()
            .rotate(180f),
        alignment = Alignment.TopEnd,
        painter = painterResource(id = R.drawable.triangle),
        contentDescription = null)
    Column(modifier=Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.mar),
            modifier = Modifier.padding(30.dp),
            contentDescription = null)
        Text(
            text = "Choose your kitten",
        )
        ScreenList(onClick = onClick)
    }
}