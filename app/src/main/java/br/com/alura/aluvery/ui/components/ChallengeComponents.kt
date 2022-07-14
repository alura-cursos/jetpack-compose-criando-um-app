package br.com.alura.aluvery.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alura.aluvery.R
import br.com.alura.aluvery.ui.theme.Purple200
import br.com.alura.aluvery.ui.theme.Purple500
import br.com.alura.aluvery.ui.theme.Purple700

@Preview(showBackground = true)
@Composable
fun ChallengeComposable() {
    Surface(
        Modifier.padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp
    ) {
        Row(
            Modifier
                .height(height = 200.dp)
                .fillMaxWidth()
        ) {
            val imageSize = 100.dp
            Box(
                Modifier
                    .fillMaxHeight()
                    .width(imageSize)
                    .background(
                        brush = Brush.verticalGradient(
                            listOf(
                                Purple700, Purple200
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .size(imageSize)
                        .align(Alignment.Center)
                        .offset(x = imageSize / 2)
                        .clip(CircleShape)
                        .border(
                            BorderStroke(
                                2.dp, brush = Brush.verticalGradient(
                                    listOf(
                                        Purple200, Purple700
                                    )
                                )
                            ), CircleShape
                        )
                )
            }
            Spacer(Modifier.width(imageSize / 2))
            Box(
                Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .padding(16.dp)
                    .align(CenterVertically),
            ) {
                Column {
                    Text(
                        text = LoremIpsum(50).values.first(),
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = 20.sp
                    )
                }
            }
        }
    }
}