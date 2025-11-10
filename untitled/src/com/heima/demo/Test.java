package com.heima.demo;

/**
 * ClassName: Test
 * Package: com.heima.demo
 */
public class Test {
    public static void main(String[] args) {
        Movie[] movies=new Movie[6];
        movies[0]=new Movie("唐顿庄园","热巴",1,9.5);
        movies[1]=new Movie("园","热巴",2,9.5);
        movies[2]=new Movie("唐庄园","热巴",3,9.5);
        movies[3]=new Movie("顿庄园","热巴",4,9.5);
        movies[4]=new Movie("唐园","热巴",5,9.5);
        movies[5]=new Movie("唐","热巴",6,9.5);

        MovieOperator mo=new MovieOperator(movies);
        mo.printAllMovies();
        mo.searchMovieById();

    }
}
