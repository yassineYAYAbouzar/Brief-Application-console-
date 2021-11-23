import java.util.ArrayList;
import java.util.Random;

public class RandomNb {
	private static ArrayList<Integer> randomNmbr() {
		ArrayList<Integer> randomNmbr = new ArrayList<Integer>();

		Random rand = new Random();
		for (int i = 0; i < 4; i++) {
			randomNmbr.add(rand.nextInt(5));
			
		}
		return randomNmbr;
	}
	public static ArrayList<Integer> getrandomNmbrs() {
		return randomNmbr();
	}
}
