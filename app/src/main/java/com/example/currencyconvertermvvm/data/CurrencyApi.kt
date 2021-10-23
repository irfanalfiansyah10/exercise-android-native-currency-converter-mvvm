package com.example.currencyconvertermvvm.data

import com.example.currencyconvertermvvm.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {
    @GET("/latest")
    suspend fun getRates(
        @Query("base") base: String,
        @Query("access_key") accessKey: String = "f6adef5776b1f511308283203dbc95bf",
        @Query("format") format: String = "1",
        @Query("symbols") symbols: String = "IDR, USD, EUR",
    ) : Response<CurrencyResponse>
}