package com.Marla.arquitectura.data

import com.Marla.arquitectura.data.model.QuoteModel
import com.Marla.arquitectura.data.model.QuoteProvider
import com.Marla.arquitectura.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}