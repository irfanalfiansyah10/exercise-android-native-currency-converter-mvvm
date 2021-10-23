package com.example.currencyconvertermvvm.data.models


import com.google.gson.annotations.SerializedName

data class Rates(
    @SerializedName("IDR")
    val iDR: Double,
    @SerializedName("USD")
    val uSD: Double,
    @SerializedName("EUR")
    val eUR: Double,
)