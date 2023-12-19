package com.example.umc_flo_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

//@Composable
//fun BookmarkPage() {
//    val songs = remember { mutableStateListOf<Song>() }
//
//    // 데이터베이스에서 노래를 가져와서 songs에 추가합니다.
//    // ...
//
//    LazyColumn {
//        items(songs) { song ->
//            SongItem(song = song)
//        }
//    }
//}
//
//@Composable
//fun SongItem(song: Song) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp)
//    ) {
//        Image(
//            painter = rememberImagePainter(data = song.albumArt),
//            contentDescription = null,
//            modifier = Modifier.size(64.dp)
//        )
//        Column(
//            modifier = Modifier
//                .padding(start = 16.dp)
//                .align(Alignment.CenterVertically)
//        ) {
//            Text(text = song.title, fontWeight = FontWeight.Bold)
//            Text(text = song.artist)
//        }
//    }
//}
