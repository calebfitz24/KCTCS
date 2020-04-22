import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MovieMap {
	
	public static void main(String[] args) {
		//3 Movies
		Movie movie1 = new Movie("Star Wars: Phantom Menace", 
				"Science Fiction", "May 19, 1999", 3);
		Movie movie2 = new Movie("Marvel's Avengers: Infinity War", 
				"Action + Fiction", "April 27, 2018", 5);
		Movie movie3 = new Movie("Bad Boys II", "Action + Crime", 
				"July 18, 2003", 3);
		//Map
		Map<String, Movie> movies = new HashMap<>();
		
		//Put those movies in map
		movies.put(movie1.getMovieGenre(), movie1);
		movies.put(movie2.getMovieGenre(), movie2);
		movies.put(movie3.getMovieGenre(), movie3);
		System.out.println(movies);
		System.out.println("Action + Fiction".equals(movie2.getMovieGenre()));
		
		movies.put(movie1.getMovieName(), movie1);
		movies.put(movie2.getMovieName(), movie2);
		movies.put(movie3.getMovieName(), movie3);
		System.out.println(movies);
		System.out.println("Star Wars: Phantom Menace ".equals(movie1.getMovieName()));
		
		movies.put(movie1.getMovieReleaseDate(), movie1);
		movies.put(movie2.getMovieReleaseDate(), movie2);
		movies.put(movie3.getMovieReleaseDate(), movie3);
		System.out.println(movies);
		System.out.println("July 18, 2003".equals(movie3.getMovieReleaseDate()));
		
		
		//print out values
		Iterator moviesPrint = movies.entrySet().iterator();
			while(moviesPrint.hasNext()) {
				Map.Entry movieMap = (Entry) moviesPrint.next();
				System.out.println(movieMap.getValue().toString());
			}
	}
}
