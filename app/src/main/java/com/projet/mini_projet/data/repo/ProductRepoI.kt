package com.projet.mini_projet.data.repo


import com.projet.mini_projet.data.model.Products
import com.projet.mini_projet.persistant.AppDatabase
import io.reactivex.Single

interface ProductRepoI {
    fun getProductList(): Single<Products>
    fun getLocalProductList(database: AppDatabase): Single<List<Products.Product>>
}
