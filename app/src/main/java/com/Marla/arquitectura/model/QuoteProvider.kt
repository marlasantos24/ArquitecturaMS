package com.Marla.arquitectura.model

class QuoteProvider {
    companion object {

       fun random():QuoteModel{
           val position = (0..9).random()
           return quote[position]
       }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "It´s me",
                author = "Marla"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Suzzet"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Gianna"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Harenua"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Francisca"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Gaspar"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Angel"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Karla"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Logan"
            ),
            QuoteModel(
                quote = "It´s me",
                author = "Nahomy"
            ),
        )
    }


}