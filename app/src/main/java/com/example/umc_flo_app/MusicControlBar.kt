package com.example.umc_flo_app

import android.content.DialogInterface.OnClickListener
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.media3.exoplayer.ExoPlayer
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Preview
@Composable
fun BottomMusicBar(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                modifier=Modifier,
                containerColor = Color(0xF0F0F0F0),
                content = {
                    Row( horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()) {
                        Column(
                            verticalArrangement = Arrangement.SpaceAround,
                            modifier=Modifier
                                .offset(x=20.dp)

                        ){
                            Text(
                                text="Scott Pilgrim",
                                modifier=Modifier,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                            )
                            Text(
                                text="Takes off",
                                modifier=Modifier,
                                fontWeight = FontWeight.Bold,
                                fontSize = 15.sp,
                                color = Color.Gray
                            )


                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.PlayArrow,
                                contentDescription = "Localized description",
                            )
                        }
                    }

                },

                )
        },
    ) { innerPadding->
        val navController = rememberNavController()
        NavHost(navController = navController,
            modifier=Modifier.padding(innerPadding),
            startDestination =  Screen.MainScreen.route ){
            composable(route = Screen.MainScreen.route){
               MainScreen(navController=navController)
            }
            composable(route = Screen.AlbumScreen.route){
                AlbumScreen(navController=navController)
            }
        }

    }
}

@Composable
fun MainScreen(navController:NavController){
    val state = rememberScrollState()
    LaunchedEffect(Unit) {state.animateScrollTo(300)}

    Column (
        modifier= Modifier
            .verticalScroll(state),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start){
        AlbumDefault()
        TextBar("오늘의 발매 음악", Modifier.offset(y=10.dp))
        Button(onClick = { navController.navigate(Screen.AlbumScreen.route)},
            colors= ButtonDefaults.buttonColors(containerColor = Color.Transparent),
            modifier= Modifier
                .fillMaxWidth()

            ){
            AlbumHorizon()
        }
        TextBar("오늘의 뮤직 비디오",Modifier)
        AlbumHorizon2()
    }

}


@Composable
fun AlbumScreen(navController: NavController){
    Box (){
        AlbumActivity()
        IconButton(
            onClick = { navController.navigate(Screen.MainScreen.route) },
            modifier = Modifier.size(40.dp)
        ) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}


