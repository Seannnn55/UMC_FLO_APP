
package com.example.umc_flo_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.umc_flo_app.ui.theme.UMC_FLO_AppTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UMC_FLO_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = MaterialTheme.colorScheme.background
                ) {
                    ScrollHome()
                }
            }
        }
    }
}

@Composable
fun ScrollHome(){
    val state = rememberScrollState()
    LaunchedEffect(Unit) {state.animateScrollTo(100)}

    Column {
        AlbumDefault()
    }

}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column ( ){
        Text(
            text = stringResource(R.string.str_des),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            modifier = Modifier
                .offset(x=20.dp, y = 40.dp)
        )
        Text(
            text = stringResource(R.string.abm_exp),
            color = Color.White,
            modifier = Modifier
                .offset(x=20.dp,y=200.dp),
            fontSize = 15.sp
        )
    }

}

@Composable
fun MiniDefault(modifier:Modifier){
    val img = painterResource(R.drawable.scott_album)

    Row (modifier=modifier
        .offset(x=20.dp,y=(-40).dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ){
        Image(
            painter = img,
            contentDescription = null,
            modifier = Modifier
                .size(60.dp)
                .clip(RoundedCornerShape(6.dp))

        )
        Column(modifier = modifier
            .offset(x=10.dp),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.Start
        ){
            Text(text = "Scott Pilgrim",
                color = Color.White,
//                modifier=modifier.offset(y=30.dp)
            )
            Text(text ="Take off",
                color = Color.White,

            )
        }
    }

}

@Composable
fun AlbumDefault(modifier: Modifier = Modifier){
    val img = painterResource(R.drawable.img_first_album_default)
    val img2 = painterResource(R.drawable.btn_panel_play_large)
    Box {
        Image(
            painter = img,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth()
        )
        Image(
            painter = img2,
            contentDescription = null,
            modifier = Modifier
                .size(90.dp)
                .align(Alignment.TopEnd)
                .offset(x = (-20).dp, y = 90.dp)
        )
        Greeting()
        MiniDefault(
            modifier = Modifier
                .align(Alignment.BottomStart)

        )

    }
}

@Composable
fun TextBar() {
    val text: String = "오늘의 발매 음악"
    Text(
        text = text

    )
}

@Composable
fun AlbumHorizon(){
    val state = rememberScrollState()
    LaunchedEffect(Unit) {state.animateScrollTo(100)}

    val alm1 = painterResource(R.drawable.scott_album)

    Row(modifier=Modifier
        .size(100.dp)
    ){
        Image(
            painter =alm1,
            contentDescription =null,
            modifier = Modifier

        )
        Image(
            painter =alm1,
            contentDescription =null,
            modifier = Modifier

        )
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UMC_FLO_AppTheme {
        ScrollHome()
    }
}