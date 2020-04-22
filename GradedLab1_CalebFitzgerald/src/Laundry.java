
public class Laundry {

	void doYourLaundry() {
		System.out.println("Laundry is my least favorite chore");
	}

	void cleanYourRoom(String number) {
		System.out.println("I have asked you " + number + "times to clean your room");
	}
	
	void doChores() {
		doYourLaundry();
		cleanYourRoom("8");
	}
}
