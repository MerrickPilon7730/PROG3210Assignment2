package com.example.prog3210_assignment2.utils

import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaType

class ApiClient {
    private val client = OkHttpClient()
    private val json = "application/json; charset=utf-8".toMediaType()

    fun fetchMovieData(url: String, callback: Callback) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(callback)
    }
}
