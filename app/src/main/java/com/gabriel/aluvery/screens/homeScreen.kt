package com.gabriel.aluvery.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.gabriel.aluvery.Model.Product
import com.gabriel.aluvery.R
import com.gabriel.aluvery.components.ItemList
import com.gabriel.aluvery.components.ProductSection
import java.math.BigDecimal

@Composable
fun HomeScreen(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())) {
        Row {
            ItemList(Product(name = "Salmão",price =  BigDecimal("15.25"),image = R.drawable.kotlin_svg));
        }
        Spacer(Modifier)
        ProductSection();
        ProductSection();
        ProductSection();
        ProductSection();
        ProductSection();
        Spacer(Modifier)
    }
}