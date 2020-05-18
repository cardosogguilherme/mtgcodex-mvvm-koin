package com.myrium.data.remote

import com.myrium.data.model.CardResponseDTO
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ScryfallService {
    @GET("/cards")
    fun getCards(@Query("page") page: Int = 0): Deferred<CardResponseDTO>
}