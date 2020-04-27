package caleb.film;

/**
 * 
 * @author cfitz
 * This is a basic java bean that holds the film data/state
 * It implements Comparable so that we can do sorting
 */
public class Film implements Comparable<Film> {
	private String name;
	private String type;
	private int releaseYear;
	private String genre;
	private double rating;

	Film(String nameIn, String typeIn, int releaseYearIn, String genreIn, double ratingIn) {
		this.setName(nameIn);
		this.setType(typeIn);
		this.setReleaseYear(releaseYearIn);
		this.setGenre(genreIn);
		this.setRating(ratingIn);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(200);
		sb.append("Film: " + name);
		sb.append("\tType: " + type);
		sb.append("\tRelease Year: " + releaseYear);
		sb.append("\tGenre: " + genre);
		sb.append("\tRating: " + rating);
		return sb.toString();
	}

	@Override
	public int compareTo(Film o) {

		return this.getName().compareTo(o.getName());
	}

}
