package com.example.myhh.recucleview

import com.google.gson.annotations.SerializedName

data class Models(
    @SerializedName("product_id")
    private val productId: String? = null,
    @SerializedName("last_date")
    private val lastDate: String? = null,
    @SerializedName("product_name")
    private val productName: String? = null,
    @SerializedName("product_image")
    private val productImage: String? = null
)
