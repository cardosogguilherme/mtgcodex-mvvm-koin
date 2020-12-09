package com.guilhermecardoso.core.data.remote.responses

import io.mockk.mockk
import org.junit.Assert
import org.junit.Test

class ListResponseTest {

    @Test
    fun createListResponse_ShouldAddCorrectAttributes() {
        val totalCards = 500
        val hasMore = true
        val nextPage = "www.magicthegathering.com"
        val data:List<CardResponse> = mockk()

        val listResponse = ListResponse<CardResponse>(
            totalCards = totalCards,
            hasMore = hasMore,
            nextPage = nextPage,
            data = data
        )

        Assert.assertEquals(totalCards, listResponse.totalCards)
        Assert.assertEquals(hasMore, listResponse.hasMore)
        Assert.assertEquals(nextPage, listResponse.nextPage)
        Assert.assertEquals(data, listResponse.data)
    }

    @Test
    fun createListResponse_ShouldAddCorrectAttributesWithSetResponse() {
        val totalCards = 500
        val hasMore = true
        val nextPage = "www.magicthegathering.com"
        val data:List<SetResponseType> = mockk()

        val listResponse = ListResponse<SetResponseType>(
            totalCards = totalCards,
            hasMore = hasMore,
            nextPage = nextPage,
            data = data
        )

        Assert.assertEquals(totalCards, listResponse.totalCards)
        Assert.assertEquals(hasMore, listResponse.hasMore)
        Assert.assertEquals(nextPage, listResponse.nextPage)
        Assert.assertEquals(data, listResponse.data)
    }
}