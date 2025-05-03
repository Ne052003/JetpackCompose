package com.neoapps.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.neoapps.myapplication.ui.theme.MyApplicationTheme

/**
 * This is the main activity of the application.
 * Extends ComponentActivity where only base functionality is included.
 */
class MainActivity : ComponentActivity() {
    /**
     * This function is called when the activity is created. Is a lifecycle function of the activity.
     * @param savedInstanceState The saved state of the activity.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        /**
         * Sets the content of the activity using @Composable functions.
         */
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * This is a composable function that displays a greeting message.
 * It's a function that can be called from other parts of the app.
 * It can react to state changes and recompose the UI accordingly.
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

/**
 * This is a preview of the Greeting composable function.
 * The preview is only shown in debug mode.
 */
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}