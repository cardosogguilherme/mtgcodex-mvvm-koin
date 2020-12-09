package com.guilhermecardoso.core.data.remote.responses

import com.google.gson.annotations.SerializedName

/*
* Generic network response for a T type
* @param object The type of response
* @param total_cards Total cards from the query, not necessarily in this response (multi-page)
* @param has_more If it has more results to be followed
* @param next_page The request/query for the next results
* @data The data returned
* */

abstract class BaseResponse
object UnknownResponseType: BaseResponse()