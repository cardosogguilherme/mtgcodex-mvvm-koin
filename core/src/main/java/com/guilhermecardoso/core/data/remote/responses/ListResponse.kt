package com.guilhermecardoso.core.data.remote.responses

import com.google.gson.annotations.SerializedName

data class ListResponse<T: BaseResponse>(
    @SerializedName("total_cards") val totalCards: Int? = 0,
    @SerializedName("has_more") val hasMore: Boolean = false,
    @SerializedName("next_page") val nextPage: String? = null,
    @SerializedName("data") val data: List<T>? = null
)
