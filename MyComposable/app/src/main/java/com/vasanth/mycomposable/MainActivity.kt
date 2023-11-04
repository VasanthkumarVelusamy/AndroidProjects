package com.vasanth.mycomposable

import android.os.Bundle
import android.service.quicksettings.Tile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.vasanth.mycomposable.ui.theme.MyComposableTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun TileContainer(modifier: Modifier = Modifier) {

    Column {
        Row(Modifier.weight(1f)) {
            Tile(
                title = "Text composable",
                body = "This is text composablevsdvsdvsdvsvsgsdfgsgfhdfghdfgsdfg",
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Tile(title = "Text composable", body = "This is text composable", color = Color(0xFFD0BCFF), modifier = Modifier.weight(1f))
        }
        Row(
            Modifier.weight(1f)
        ) {
            Tile(
                title = "Text composable",
                body = "This is text composablevsdvsdvsdvsvsgsdfgsdfgsdfg",
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f),
            )
            Tile(title = "Text composable", body = "This is text composable", color = Color(0xFFF6EDFF), modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun Tile(title: String, body: String, color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.background(color).fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = title)
        Text(text = body, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    MyComposableTheme {
        TileContainer()
    }
}