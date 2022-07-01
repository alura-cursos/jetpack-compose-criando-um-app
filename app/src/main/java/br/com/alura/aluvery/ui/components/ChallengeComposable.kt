package br.com.alura.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ChallengeComposable() {
    Row(
        Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Box(
            Modifier
                .fillMaxHeight()
                .width(100.dp)
                .background(Color.Blue)
        )
        Column {
            Text(
                "Test 1",
                Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFededed))
                    .padding(16.dp)
            )
            Text("Test 2", Modifier.padding(16.dp))
        }
    }
}