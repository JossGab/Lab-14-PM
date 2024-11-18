package com.example.lab14

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab14.ui.theme.Lab14Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Habilitar diseño Edge-to-Edge
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            Lab14Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Utilizando innerPadding para aplicar el relleno al contenido
                    SimpleWidget(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun SimpleWidget(modifier: Modifier = Modifier) {
    // Ejemplo de un widget simple
    Text(
        text = "Hello from SimpleWidget!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab14Theme {
        SimpleWidget()
    }
}
