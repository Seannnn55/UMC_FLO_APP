package com.example.umc_flo_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.compose.material3.BottomAppBar as Material3BottomAppBar




@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun BottomAppBarExample() {
    Scaffold(
        bottomBar = {
            Material3BottomAppBar(
                containerColor = Color.White,
                content = {
                    Row(
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        IconButton(onClick = { /* do something */ }) {
                            Icon(Icons.Filled.Home,
                                contentDescription = "Localized description")
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = "Localized description",
                            )
                        }
                        IconButton(onClick = { /* do something */ }) {
                            Icon(
                                Icons.Filled.Menu,
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
            BottomMusicBar()
        }

    }
}

@Composable
fun FloApp(modifier:Modifier=Modifier) {
    val navController = rememberNavController()
    Scaffold(
        topBar ={
            BottomAppBarExample()
        }
    ){innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()

        ) {
            BottomAppBarExample()
        }
    }

}