package com.example.myhh.recucleview

import com.google.gson.annotations.SerializedName

 data class Response<T>(
    @SerializedName("product_offset")
    val product_offset: Int? = null,
    @SerializedName("status")
    internal val status: Int? = null,
    @SerializedName("products")
     val list: List<Models>? = null

)
