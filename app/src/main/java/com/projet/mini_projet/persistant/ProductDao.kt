package com.projet.mini_projet.persistant

import androidx.room.*
import com.projet.mini_projet.data.model.Products

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(person: Products.Product)

    @Insert
    fun insertMultipleProduct(person: List<Products.Product>)

    @Update
    fun updateProduct(person: Products.Product)

    @Query("SELECT * FROM PRODUCT WHERE id = :id")
    fun getProduct(id: String): Products.Product?

    @Query("SELECT * FROM PRODUCT ORDER BY id")
    fun getAllProducts(): List<Products.Product>?

    @Delete
    fun deleteProduct(person: Products.Product)
}