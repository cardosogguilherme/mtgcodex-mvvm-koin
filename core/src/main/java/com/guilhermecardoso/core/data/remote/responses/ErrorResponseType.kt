package com.guilhermecardoso.core.data.remote.responses

import com.google.gson.annotations.SerializedName

data class ErrorResponseType(
    @SerializedName("status") val status: Int,
    @SerializedName("code") val code: String,
    @SerializedName("details") val details: String,
    @SerializedName("type") val type: String? = null,
): BaseResponse()