package com.gabriel.aluvery.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gabriel.aluvery.Model.Product

@Composable
fun ItemList(product: Product) {
    Surface(
        Modifier.padding(start = 16.dp),
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 8.dp
    ) {
        Column(
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)

        ) {
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .background(Color.Blue)
                    .fillMaxWidth()
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                Color(0xFF6200EE),
                                Color(0xFF03DAC5)
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = product.image),
                    contentDescription = "Logo do Kotlin",
                    contentScale = ContentScale.Crop ,
                    modifier = Modifier
                        .size(100.dp)
                        .offset(y = 50.dp)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter)

                )
            }
            Spacer(modifier = Modifier.height(50.dp))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = product.price.toPlainString(),
                    modifier = Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }
    }
}
