package caleb.film;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


/**
 * 
 * @author cfitz
 *
 */
public class FilmTest {
//TODO Add scanner and a view, think about controller
//TODO Add more data
	public static void main(String[] args) {
		try (FilmReader filmRead = new FilmReader(new BufferedReader(new FileReader("MovieFile.txt")))) {
			List<Film> testFilms = filmRead.readFilms();
			//System.out.println(testFilms.readFilms());
			for (Film aFilm : testFilms) {
				System.out.println(aFilm);
			}
			
			//Loop through the list with a lambda
			System.out.println("Lambda Report: ");
			testFilms.forEach(f -> System.out.println(f));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} 

	}

}
