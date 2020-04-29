package com.example.movie_db.classes

import com.google.gson.annotations.SerializedName

data class SavingResponse (
    @SerializedName("id")
    val id: Int,

    @SerializedName("favorite")
    val favorite: Boolean,

    @SerializedName("rated")
    val rated: Object,

    @SerializedName("watchlist")
    val watchlist: Boolean
)
