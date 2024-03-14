package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController

@Composable
fun OpenScreen(onClick: () -> Unit){
    val navController = rememberNavController()
    Box(modifier = Modifier
        ){
        Image(
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.pic1),
            contentDescription = null
        )
        Button(
            onClick = { onClick() },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier = Modifier
                .align(Alignment.TopStart)
                .wrapContentSize()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_back),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                text = "My Text",
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp,0.dp,0.dp,0.dp)
            )
            Text(
                text = "Discription bla bla bla bla bla bla",
                color = Color.White,
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp)
            )
        }
    }
}
