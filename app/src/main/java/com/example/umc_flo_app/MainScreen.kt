package com.example.umc_flo_app

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.umc_flo_app.ui.theme.UMC_FLO_AppTheme


@Composable
fun ScrollHome() {
    val state = rememberScrollState()
    LaunchedEffect(Unit) {state.animateScrollTo(300)}

    Column (
        modifier= Modifier
            .verticalScroll(state),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start){
        AlbumDefault()
        TextBar("오늘의 발매 음악", Modifier.offset(y=10.dp))
        AlbumHorizon()
        TextBar("오늘의 뮤직 비디오",Modifier)
        AlbumHorizon2()
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
fun MiniDefault(modifier: Modifier){
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
fun TextBar(text:String, modifier: Modifier) {
    Text(
        text = text,
        color = Color.Black,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        modifier = Modifier
            .offset(x=20.dp, y = 10.dp)

    )
}

@Composable
fun AlbumHorizon(){

    val state = rememberScrollState()
    LaunchedEffect(Unit) { state.animateScrollTo(100) }

    val alm1 = painterResource(R.drawable.scott_album)
    val alm2 = painterResource(R.drawable.rick_mor)
    val alm3 = painterResource(R.drawable.ins_job)
    val alm4 = painterResource(R.drawable.sol_opp)

    Row(modifier= Modifier
        .horizontalScroll(state)
        .fillMaxWidth()
        .padding(20.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalAlignment = Alignment.Top
    ){
        Image(
            painter =alm1,
            contentDescription =null,
            modifier = Modifier
                .size(150.dp)
        )
        Image(
            painter =alm2,
            contentDescription =null,
            modifier = Modifier
                .size(150.dp)
        )
        Image(
            painter=alm3,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
        )
        Image(
            painter=alm4,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
        )

    }


}

@Composable
fun AlbumHorizon2(){

    val alm1 = painterResource(R.drawable.discovery_banner_aos)

    Row(modifier= Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalAlignment = Alignment.Top
    ){
        Image(
            painter =alm1,
            contentDescription =null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y=40.dp)
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