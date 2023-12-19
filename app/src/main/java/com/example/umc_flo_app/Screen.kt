package com.example.umc_flo_app

sealed class Screen(val route: String){
    object MainScreen: Screen("main_screen")
    object AlbumScreen: Screen("album_screen")
}
