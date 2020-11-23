package com.guilhermecardoso.core.data

import com.guilhermecardoso.core.data.model.Card
import com.guilhermecardoso.core.data.remote.ScryfallService
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class CardRepository(private val cardApi: ScryfallService) {

    suspend fun getCards(): List<Card> = withContext(Dispatchers.IO) {
        return@withContext cardApi.getCards().await().data
    }
}