package com.projet.mini_projet.network


import com.projet.mini_projet.data.model.Products
import com.projet.mini_projet.ui.splash.PRODUCT_LIST_URL
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET(PRODUCT_LIST_URL)
    fun getProductList(): Call<Products>
}