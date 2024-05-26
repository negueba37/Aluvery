package com.gabriel.aluvery.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gabriel.aluvery.Model.Product
import com.gabriel.aluvery.R
import java.math.BigDecimal

@Composable
fun ProductSection() {
    Column() {
        Text(
            text = "Promoções",
            Modifier.padding(16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(
                    rememberScrollState()
                )

        ) {
            ItemList(Product(name = "Peixe",price =  BigDecimal("15.25"),image = R.drawable.img_20221030_150629));
            ItemList(Product(name = "Salmão",price =  BigDecimal("15.25"),image = R.drawable.img_20221030_151636));
            ItemList(Product(name = "Peixe",price =  BigDecimal("15.25"),image = R.drawable.img_20221030_150629));
            ItemList(Product(name = "Salmão",price =  BigDecimal("15.25"),image = R.drawable.img_20221030_151636));
            ItemList(Product(name = "Peixe",price =  BigDecimal("15.25"),image = R.drawable.img_20221030_150629));
            ItemList(Product(name = "Salmão",price =  BigDecimal("15.25"),image = R.drawable.img_20221030_151636));


        }
    }

}
