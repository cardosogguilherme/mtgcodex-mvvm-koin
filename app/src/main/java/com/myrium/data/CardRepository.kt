package com.myrium.data

import com.myrium.data.model.Card
import com.myrium.data.remote.ScryfallService

class CardRepository(private val cardApi: ScryfallService) {

    suspend fun getCards(): List<Card> {
        return cardApi.getCards().await().data
    }
}