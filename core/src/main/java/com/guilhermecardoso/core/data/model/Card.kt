package com.guilhermecardoso.core.data.model

import com.google.gson.annotations.SerializedName

abstract class ApiResponse

data class CardResponseDTO(
    @SerializedName("total_cards") val totalCards: Int,
    @SerializedName("has_more") val hasMore: Boolean,
    @SerializedName("next_page") val nextPage: String,
    @SerializedName("data") val data: List<Card>
): ApiResponse()

data class Card(
    @SerializedName("artist") val artist: String,
    @SerializedName("artist_ids") val artistIds: List<String>,
    @SerializedName("booster") val booster: Boolean,
    @SerializedName("border_color") val borderColor: String,
    @SerializedName("card_back_id") val cardBackId: String,
    @SerializedName("cmc") val cmc: Double,
    @SerializedName("collector_number") val collectorNumber: String,
    @SerializedName("color_identity") val colorIdentity: List<String>,
    @SerializedName("colors") val colors: List<String>,
    @SerializedName("digital") val digital: Boolean,
    @SerializedName("edhrec_rank") val edhrecRank: Int,
    @SerializedName("foil") val foil: Boolean,
    @SerializedName("frame") val frame: String,
    @SerializedName("full_art") val fullArt: Boolean,
    @SerializedName("games") val games: List<String>,
    @SerializedName("highres_image") val highresImage: Boolean,
    @SerializedName("id") val id: String,
    @SerializedName("illustration_id") val illustrationId: String,
    @SerializedName("image_uris") val imageUris: ImageUris,
    @SerializedName("lang") val lang: String,
    @SerializedName("layout") val layout: String,
    @SerializedName("legalities") val legalities: Legalities,
    @SerializedName("mana_cost") val manaCost: String,
    @SerializedName("multiverse_ids") val multiverseIds: List<Int>,
    @SerializedName("name") val name: String,
    @SerializedName("nonfoil") val nonfoil: Boolean,
    @SerializedName("oracle_id") val oracleId: String,
    @SerializedName("oracle_text") val oracleText: String,
    @SerializedName("oversized") val oversized: Boolean,
    @SerializedName("prices") val prices: Prices,
    @SerializedName("prints_search_uri") val printsSearchUri: String,
    @SerializedName("promo") val promo: Boolean,
    @SerializedName("purchase_uris") val purchaseUris: PurchaseUris,
    @SerializedName("rarity") val rarity: String,
    @SerializedName("related_uris") val relatedUris: RelatedUris,
    @SerializedName("released_at") val releasedAt: String,
    @SerializedName("reprint") val reprint: Boolean,
    @SerializedName("reserved") val reserved: Boolean,
    @SerializedName("rulings_uri") val rulingsUri: String,
    @SerializedName("scryfall_set_uri") val scryfallSetUri: String,
    @SerializedName("scryfall_uri") val scryfallUri: String,
    @SerializedName("set") val `set`: String,
    @SerializedName("set_name") val setName: String,
    @SerializedName("set_search_uri") val setSearchUri: String,
    @SerializedName("set_type") val setType: String,
    @SerializedName("set_uri") val setUri: String,
    @SerializedName("story_spotlight") val storySpotlight: Boolean,
    @SerializedName("textless") val textless: Boolean,
    @SerializedName("type_line") val typeLine: String,
    @SerializedName("uri") val uri: String,
    @SerializedName("variation") val variation: Boolean
): ApiResponse()

data class ImageUris(
    val art_crop: String,
    val border_crop: String,
    val large: String,
    val normal: String,
    val png: String,
    val small: String
)

data class Legalities(
    val brawl: String,
    val commander: String,
    val duel: String,
    val future: String,
    val historic: String,
    val legacy: String,
    val modern: String,
    val oldschool: String,
    val pauper: String,
    val penny: String,
    val pioneer: String,
    val standard: String,
    val vintage: String
)

data class Prices(
    val eur: Any,
    val tix: Any,
    val usd: Any,
    val usd_foil: Any
)

data class PurchaseUris(
    val cardhoarder: String,
    val cardmarket: String,
    val tcgplayer: String
)

data class RelatedUris(
    val edhrec: String,
    val mtgtop8: String,
    val tcgplayer_decks: String
)