package com.guilhermecardoso.core.data.remote.responses

import com.google.gson.annotations.SerializedName

data class SetResponseType(
    @SerializedName("arena_code")
    val arenaCode: String?,
    @SerializedName("block")
    val block: String?,
    @SerializedName("block_code")
    val blockCode: String?,
    @SerializedName("card_count")
    val cardCount: Int,
    @SerializedName("code")
    val code: String,
    @SerializedName("digital")
    val digital: Boolean,
    @SerializedName("foil_only")
    val foilOnly: Boolean,
    @SerializedName("icon_svg_uri")
    val iconSvgUri: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("mtgo_code")
    val mtgoCode: String?,
    @SerializedName("name")
    val name: String,
    @SerializedName("nonfoil_only")
    val nonfoilOnly: Boolean,
    @SerializedName("printed_size")
    val printedSize: Int? = 0,
    @SerializedName("released_at")
    val releasedAt: String?,
    @SerializedName("scryfall_uri")
    val scryfallUri: String,
    @SerializedName("search_uri")
    val searchUri: String,
    @SerializedName("set_type")
    val setType: String,
    @SerializedName("tcgplayer_id")
    val tcgplayerId: Int?,
    @SerializedName("uri")
    val uri: String
): BaseResponse()