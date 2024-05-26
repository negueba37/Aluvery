package com.gabriel.aluvery.Model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product (
    val name:String,
    val price: BigDecimal,
    @DrawableRes var image:Int
){

}
