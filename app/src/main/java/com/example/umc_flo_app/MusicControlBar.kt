package com.example.umc_flo_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.media3.exoplayer.ExoPlayer
import androidx.compose.material3.Scaffold
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


class MusicControlBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val player = ExoPlayer.Builder(applicationContext).build()
    }
}


@Preview
@Composable
fun BottomMusicBar(modifier: Modifier = Modifier) {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                containerColor = Color.LightGray,
                content = {
                    Row( horizontalArrangement = Arrangement.End,
                        modifier = Modifier.fillMaxWidth()) {
                        IconButton(onClick = { /* do something */}) {
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
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()

        ) {
            ScrollHome()
        }

    }
}



