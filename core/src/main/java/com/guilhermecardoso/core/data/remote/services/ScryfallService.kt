package com.guilhermecardoso.core.data.remote.services

import com.guilhermecardoso.core.data.remote.responses.CardResponse
import com.guilhermecardoso.core.data.remote.responses.ListResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.GET
import retrofit2.http.Query

interface ScryfallService {

    @GET("/cards")
    fun getCardsAsync(@Query("page") page: Int = 0): Deferred<ListResponse<CardResponse>>
}