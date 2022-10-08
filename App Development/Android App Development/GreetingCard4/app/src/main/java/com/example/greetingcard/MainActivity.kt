package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    birthdayImage("Dhruv",from="Google")
                }
            }
        }
    }
}

@Composable
fun birthdayImage(name: String,from: String){
    val image= painterResource(id = R.drawable.androidparty) //image:id of the resource
    Box{
        Image(painter=image,contentDescription=null, modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(), contentScale = ContentScale.Crop)
        birthdaytext(name = name, from = from )
    }
}


@Composable
fun birthdaytext(name: String, from:String) {
    Column(horizontalAlignment = Alignment.End){


        Text(text = "Happy Birthday $name!", modifier = Modifier.padding(start = 16.dp,top=16.dp))
        Text(text = "From $from",fontSize=20.sp)
    }
}


@Preview(showBackground = true)
@Composable
fun birthdayImagePreview() {
    GreetingCardTheme {
        birthdayImage("Kotin",from="Google")
    }
}

