package com.projet.mini_projet.ui.splash

import com.projet.mini_projet.data.model.Products

object CalculatePrice {

    fun calculatePrice(products: List<Products.Product>?): Int {
        var totalPrice = 0
        products?.let {
            it.forEach { product ->
                val price: Int = removeSpacialChar(product.price!!)
                val quantity: Int = product.quantity!!.toInt()

                totalPrice += price * quantity
            }
        }
        return totalPrice
    }

    fun calculateSpacialPrice(products: List<Products.Product>?): Int {
        var totalSpecialPrice = 0
        products?.let {
            it.forEach { product ->
                val specialPrice: Int = removeSpacialChar(product.special!!)
                val quantity: Int = product.quantity!!.toInt()

                totalSpecialPrice += specialPrice * quantity
            }
        }
        return totalSpecialPrice
    }

    private fun removeSpacialChar(price: String): Int {
        val format: String = price.replace("$ ","").replace(",","")
        return format.toInt()
    }
}