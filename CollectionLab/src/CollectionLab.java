import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionLab {

	public static void main(String[] args) {
		String artists[] = { "Deitrick Haddon", "Marvin Sapp", "Kirk Franklin" };
		Collection<String> set1 = new HashSet<String>();
		
			for (int i = 0; i < 3; i++) {
				set1.add(artists[i]);
			}
			System.out.println(set1);
			set1.add("Deitrick Haddon");
			System.out.println(set1);

		String songs[] = { "Let me go", "Abundant Life", "Made it home" };
		List<String> list1 = new ArrayList<>();

			for (int i = 0; i < 3; i++) {
				list1.add(songs[i]);
			}
			System.out.println(list1);
			System.out.println(list1.get(1));
			
	}

	}