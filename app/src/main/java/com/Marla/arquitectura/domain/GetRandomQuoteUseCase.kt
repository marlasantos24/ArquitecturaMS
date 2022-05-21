package com.Marla.arquitectura.domain


import com.Marla.arquitectura.data.model.QuoteModel
import com.Marla.arquitectura.data.model.QuoteProvider


class GetRandomQuoteUseCase {


    operator fun invoke(): QuoteModel? {
        val quotes:List<QuoteModel> = QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber = (0..quotes.size-1).random()
            return quotes[randomNumber]
        }
        return null
    }

}