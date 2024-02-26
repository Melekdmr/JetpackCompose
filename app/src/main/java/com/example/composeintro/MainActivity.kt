package com.example.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeintro.ui.theme.ComposeIntroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
       setContent {
           MainScreen()

       }


    }
}



@Composable
fun MainScreen(){
    Column(
        modifier= Modifier
            .fillMaxSize()
            .background(Color.DarkGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

      CustomText(text = "Hello Android")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "jetpack compose")
        Spacer(modifier = Modifier.padding(5.dp))
        CustomText(text = "Kotlin")
        Spacer(modifier = Modifier.padding(5.dp))

        Row (modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){

            CustomText(text = "111")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "222")
            Spacer(modifier = Modifier.padding(5.dp))
            CustomText(text = "333")

        }
    }

}
@Composable
fun CustomText(text:String){
    Box(
    modifier = Modifier
        .clickable {
            println("hello android clicked")
        }
        .background(color = Color.Black)
        .padding(top = 10.dp, start = 1.dp, end = 1.dp, bottom = 30.dp)

        // .width(200.dp)
        // .height(200.dp)
        //.fillMaxWidth()
        // .fillMaxSize(0.5f)
    )
    {
        Text(
            text = text,
            color = Color.White,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Suppress("VisualLintAccessibilityTestFramework", "VisualLintAccessibilityTestFramework")
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
MainScreen()

}