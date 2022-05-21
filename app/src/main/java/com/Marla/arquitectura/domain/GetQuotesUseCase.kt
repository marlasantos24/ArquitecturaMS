package com.Marla.arquitectura.domain

import com.Marla.arquitectura.data.QuoteRepository
import com.Marla.arquitectura.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = repository.getAllQuotes()
}

