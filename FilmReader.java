package caleb.film;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author cfitz
 * @version 1.0
 * This is the Data Access Object (DAO)
 * It's job is to read the data source e.g MovieFile.txt, and return a list of films
 * contained in the file 
 */
public class FilmReader implements AutoCloseable {
	private BufferedReader films;

	FilmReader(BufferedReader filmsIn) {
		this.films = filmsIn;
	}

	List<Film> readFilms() throws IOException {
		String line = null;
		List<Film> filmList = new ArrayList<>();
		while ((line = films.readLine()) != null) {
			String[] filmToBuild = line.split(",");
			String name = filmToBuild[0];
			String type = filmToBuild[1];
			int releaseYear = Integer.parseInt(filmToBuild[2]);
			String genre = filmToBuild[3];
			double rating = Double.parseDouble(filmToBuild[4]);
			filmList.add(new Film(name, type, releaseYear, genre, rating));
		}
		return filmList;
	}

	@Override
	public void close() {
		try {
			films.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
