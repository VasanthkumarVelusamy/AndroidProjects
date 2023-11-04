package com.vasanth.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.vasanth.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        title = stringResource(R.string.article_title),
                        intro = stringResource(R.string.article_intro),
                        body = stringResource(R.string.article_body)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(title: String, modifier: Modifier = Modifier, intro: String, body: String) {
    Column(
        modifier = modifier,
    ) {
        val image = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
        )
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
            fontSize = 24.sp
        )
        Text(
            text = intro,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = body,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .padding(horizontal = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Article(title = "Jetpack Compose Tutorial", intro = "Jetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs.", body = "In this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.")
    }
}