package com.example.myapplication

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.rememberLazyListState
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


@OptIn(ExperimentalFoundationApi::class)
@Composable

fun ScreenList(onClick: () -> Unit) {
    val state = rememberLazyListState()
    Spacer(modifier = Modifier.padding(top = 15.dp))
    LazyRow(
        modifier = Modifier.fillMaxSize()
            .padding(20.dp),
        horizontalArrangement = Arrangement.spacedBy(space = 15.dp),
        state = state,
        flingBehavior = rememberSnapFlingBehavior(lazyListState = state)
    ) {
        items(1) {
            PaddingValues()
            Box(modifier = Modifier
                .padding(15.dp)
                .clickable { onClick() }){
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.pic1),
                    contentDescription = null
                )
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
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
            Box(modifier = Modifier
                .padding(15.dp)
                .clickable { onClick() }){
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.pic1),
                    contentDescription = null
                )
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
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            Box(modifier = Modifier
                .padding(15.dp)
                .clickable { onClick() }){
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(),
                    contentScale = ContentScale.Crop,
                    painter = painterResource(id = R.drawable.pic1),
                    contentDescription = null
                )
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
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}

