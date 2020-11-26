package com.guilhermecardoso.core.data.remote.responses

/*
* Generic network response for a T type
* @param object The type of response
* @param total_cards Total cards from the query, not necessarily in this response (multi-page)
* @param has_more If it has more results to be followed
* @param next_page The request/query for the next results
* @data The data returned
* */

data class BaseResponse<T>(
    val `object`: ResponseObjectType
)

sealed class ResponseObjectType()
object ListResponseType: ResponseObjectType()
object SetResponseType: ResponseObjectType()
object ErrorResponseType: ResponseObjectType()
object UnknownResponseType: ResponseObjectType()

//TODO Code SetResponse