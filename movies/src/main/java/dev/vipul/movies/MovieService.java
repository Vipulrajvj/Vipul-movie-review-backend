package dev.vipul.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {


        //to instantiate
        @Autowired
        private MovieRepository movieRepository;

        public List<Movie> allMovies() {
            return movieRepository.findAll();
        }

        //we might not get a valid id , thats why we are using optional

        public Optional<Movie> singleMovie(String imdbId) {
                return  movieRepository.findMovieByImdbId(imdbId);
        }
}
