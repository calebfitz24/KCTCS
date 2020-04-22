
public class Movie {
	private String movieName;
	private String movieGenre;
	private String movieReleaseDate;
	private int movieRating;
	
	public Movie(String movieNameIn, String movieGenreIn, String movieReleaseDateIn, int movieRatingIn) {
		super();
		this.setMovieName(movieNameIn);
		this.setMovieGenre(movieGenreIn);
		this.setMovieReleaseDate(movieReleaseDateIn);
		this.setMovieRating(movieRatingIn);
	}
	


	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(String movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public int getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}





	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieGenre=" + movieGenre + ", movieReleaseDate=" + movieReleaseDate
				+ ", movieRating=" + movieRating + "]";
	}

}
