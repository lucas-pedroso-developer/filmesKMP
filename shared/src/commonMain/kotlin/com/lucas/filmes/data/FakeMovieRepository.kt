package com.lucas.filmes.data

import com.lucas.filmes.model.Movie

class FakeMovieRepository {
    fun getPopularMovies(): List<Movie> {
        return listOf(
            Movie(id = 1, title = "Matrix", overview = "Um hacker descobre que o mundo em que vive é uma simulação criada por máquinas.", voteAverage = 8.7),
            Movie(id = 2, title = "Forrest Gump", overview = "Um homem simples e de bom coração atravessa décadas da história americana.", voteAverage = 8.8),
            Movie(id = 3, title = "O Senhor dos anéis", overview = "Um hobbit parte numa jornada para destruir um anel de poder.", voteAverage = 8.9)
        )
    }
}