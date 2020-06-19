package com.example.movie_db.model.repository

import com.example.movie_db.model.network.MovieApi
import com.google.gson.JsonObject

class UserRepositoryImpl(private val movieApi : MovieApi): UserRepository {

    override suspend fun getTokenCoroutine(apiKey: String): JsonObject? =
        movieApi.getTokenCoroutine(apiKey).body()

    override suspend fun loginCoroutine(apiKey: String, body: JsonObject): JsonObject? =
        movieApi.loginCoroutine(apiKey, body).body()

    override suspend fun getCurrentAccountCoroutine(
        apiKey: String,
        sessionId: String
    ): JsonObject? =
        movieApi.getCurrentAccountCoroutine(apiKey, sessionId).body()

    override suspend fun getSessionCoroutine(apiKey: String, body: JsonObject): JsonObject? =
        movieApi.getSessionCoroutine(apiKey, body).body()

    override suspend fun deleteSessionCoroutine(apiKey: String, body: JsonObject): JsonObject? =
        movieApi.deleteSessionCoroutine(apiKey, body).body()
}