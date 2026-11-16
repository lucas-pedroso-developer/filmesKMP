import SwiftUI
import Shared

struct ContentView: View {

    let movies = FakeMovieRepository().getPopularMovies()

    var body: some View {
        List {
            ForEach(Array(movies.enumerated()), id: \.offset) { index, movie in
                Text("\(index + 1). \(movie.title)")
            }
        }
    }
}
