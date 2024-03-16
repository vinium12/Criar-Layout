package com.example.tarefalayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarefalayout.ui.theme.TarefaLayoutTheme
import com.example.tarefalayout.ui.theme.TarefaLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarefaLayoutTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "2º Novotec",
                        novo = "Desenvolvimento de Sistemas AMS"
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, novo: String) {
    Text(
        text = message,
        fontSize = 65.sp,
        lineHeight = 60.sp,
        textAlign = TextAlign.Center,
        color = Color.White,
        modifier = Modifier
            .padding(top = 300.dp)
            .padding(start = 30.dp)
    )
    Text(
        text = novo,
        fontSize = 40.sp,
        lineHeight = 40.sp,
        textAlign = TextAlign.Center,
        color = Color.White,
        modifier = Modifier
            .padding(top = 400.dp)
            .padding(end = 0.dp)
    )
}

@Composable
fun GreetingImage(message: String, novo: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.tec)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 1F
        )
        GreetingText(
            message = message,
            novo = novo
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TarefaLayoutCardPreview() {
    TarefaLayoutTheme {
        GreetingImage(
            message = "2º Novotec",
            novo = "Desenvolvimento de Sistemas AMS"
        )
    }
}