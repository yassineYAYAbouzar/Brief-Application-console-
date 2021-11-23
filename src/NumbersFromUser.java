import java.util.ArrayList;
import java.util.Scanner;

import utils.Helper;

public class NumbersFromUser {
	 
	private static ArrayList<Integer> numbersFromUser() {
		Helper console = new Helper();
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numbersFromUser = new ArrayList<Integer>();
		 for (int i = 0; i < 4; i++) {
				 console.log("Please Enter " + (i+1) +" Number :");
				 int numberFromUser = scanner.nextInt();
				 numbersFromUser.add(numberFromUser);
		 }
		 
		 return numbersFromUser;
	}
	public static ArrayList<Integer> getnumbersFromUser() {
		return numbersFromUser();
	}
}
