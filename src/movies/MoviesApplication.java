package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {

    public static Movie[] movieList = MoviesArray.findAll();

    public static void movieMenu(){
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - view movies in the Comedy category");
        System.out.println("8 - add a movie to the list");
        System.out.println("9 - reset movie list to original");
        System.out.print("Enter your choice: ");
        int choice = Input.getInt(0, 9);
        System.out.println();
        if(choice == 1){
            for(Movie movie : movieList){
                String movieName = movie.getName();
                String movieCategory = movie.getCategory();
                System.out.printf("%s --- %s%n", movieName, movieCategory);
            }
            System.out.println();
            movieMenu();
//            return movieList;
        }else if(choice == 2){
            Movie[] animatedMovies = new Movie[0];
            for(Movie movie : movieList){
                if(movie.getCategory().equalsIgnoreCase("animated")){
//                    int animatedLength = animatedMovies.length;
//                    Movie[] animatedMoviesCopy = Arrays.copyOf(animatedMovies, animatedLength + 1);
//                    animatedMoviesCopy[animatedMoviesCopy.length - 1] = movie;
//                    animatedMovies = animatedMoviesCopy;
                    String movieName = movie.getName();
                    String movieCategory = movie.getCategory();
                    System.out.printf("%s --- %s%n", movieName, movieCategory);
                }
            }
            System.out.println();
            movieMenu();
//            return animatedMovies;
        }else if(choice == 3){
            Movie[] dramaMovies = new Movie[0];
            for(Movie movie : movieList){
                if(movie.getCategory().equalsIgnoreCase("drama")){
                    int dramaLength = dramaMovies.length;
//                    Movie[] dramaMoviesCopy = Arrays.copyOf(dramaMovies, dramaLength + 1);
//                    dramaMoviesCopy[dramaMoviesCopy.length - 1] = movie;
//                    dramaMovies = dramaMoviesCopy;
                    String movieName = movie.getName();
                    String movieCategory = movie.getCategory();
                    System.out.printf("%s --- %s%n", movieName, movieCategory);
                }
            }
            System.out.println();
            movieMenu();
//            return dramaMovies;
        }else if(choice == 4){
            Movie[] horrorMovies = new Movie[0];
            for(Movie movie : movieList){
                if(movie.getCategory().equalsIgnoreCase("horror")){
//                    int horrorLength = horrorMovies.length;
//                    Movie[] horrorMoviesCopy = Arrays.copyOf(horrorMovies, horrorLength + 1);
//                    horrorMoviesCopy[horrorMoviesCopy.length - 1] = movie;
//                    horrorMovies = horrorMoviesCopy;
                    String movieName = movie.getName();
                    String movieCategory = movie.getCategory();
                    System.out.printf("%s --- %s%n", movieName, movieCategory);
                }
            }
            System.out.println();
            movieMenu();
//            return horrorMovies;
        }else if(choice == 5){
            Movie[] sciFiMovies = new Movie[0];
            for(Movie movie : movieList){
                if(movie.getCategory().equalsIgnoreCase("scifi")){
//                    int sciFiLength = sciFiMovies.length;
//                    Movie[] sciFiMoviesCopy = Arrays.copyOf(sciFiMovies, sciFiLength + 1);
//                    sciFiMoviesCopy[sciFiMoviesCopy.length - 1] = movie;
//                    sciFiMovies = sciFiMoviesCopy;
                    String movieName = movie.getName();
                    String movieCategory = movie.getCategory();
                    System.out.printf("%s --- %s%n", movieName, movieCategory);

                }
            }
            System.out.println();
            movieMenu();
//            return sciFiMovies;
        }else if(choice == 6) {
            Movie[] musicalMovies = new Movie[0];
            for (Movie movie : movieList) {
                if (movie.getCategory().equalsIgnoreCase("musical")) {
//                    int musicalLength = musicalMovies.length;
//                    Movie[] musicalMoviesCopy = Arrays.copyOf(musicalMovies, musicalLength + 1);
//                    musicalMoviesCopy[musicalMoviesCopy.length - 1] = movie;
//                    musicalMovies = musicalMoviesCopy;
                    String movieName = movie.getName();
                    String movieCategory = movie.getCategory();
                    System.out.printf("%s --- %s%n", movieName, movieCategory);

                }

            }
            System.out.println();
            movieMenu();
//            return musicalMovies;
        }else if(choice == 7){
            Movie[] comedyMovies = new Movie[0];
            for (Movie movie : movieList) {
                if (movie.getCategory().equalsIgnoreCase("comedy")) {
//                    int comedyLength = comedyMovies.length;
//                    Movie[] comedyMoviesCopy = Arrays.copyOf(comedyMovies, comedyLength + 1);
//                    comedyMoviesCopy[comedyMoviesCopy.length - 1] = movie;
//                    comedyMovies = comedyMoviesCopy;
                    String movieName = movie.getName();
                    String movieCategory = movie.getCategory();
                    System.out.printf("%s --- %s%n", movieName, movieCategory);
                }
            }
            System.out.println();
            movieMenu();
//            return comedyMovies;
        }else if(choice == 8){
            addMovie();
            System.out.println();
            movieMenu();
        }else if(choice == 9){
            movieList = MoviesArray.findAll();
            System.out.println("Movies have been reset.");
            System.out.println();
            movieMenu();
        }
//         Movie[] movies = new Movie[0];
//        return movies;

    } // end of movieMenu method

    public static Movie[] addMovie(){
        System.out.println("What is the name of the movie?");
        String movieName = Input.getString();
        System.out.println("What is the category?");
        String movieCategory = Input.getString();
        Movie newMovie = new Movie(movieName, movieCategory);
        int movieListLength = movieList.length;
        Movie[] movieListCopy = Arrays.copyOf(movieList, movieListLength + 1);
        int movieListCopyLength = movieListCopy.length;
        movieListCopy[movieListCopyLength - 1] = newMovie;
        movieList = movieListCopy;
        return movieList;

    }

    public static void main(String[] args) {

        movieMenu();
    }
}
