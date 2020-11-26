package com.guilhermecardoso.core.data.remote.services

import com.guilhermecardoso.core.data.model.CardResponseDTO
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ScryfallService {
    @GET("/cards")
    fun getCards(@Query("page") page: Int = 0): Deferred<CardResponseDTO>
}