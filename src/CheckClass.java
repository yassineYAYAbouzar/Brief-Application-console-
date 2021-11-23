import java.util.ArrayList;

import utils.Helper;

public class CheckClass {
	static int countWin = 0;
	static Helper console = new Helper();
	public static int check(ArrayList<Integer> randomNmbrs,ArrayList<Integer> numbersFromUser ) {
		for (int i = 0; i < randomNmbrs.size(); i++) {
			if(randomNmbrs.get(i)==numbersFromUser.get(i) && randomNmbrs.contains(numbersFromUser.get(i))) {
				console.log("#");
				 countWin ++;
				
			}
		}
		
		for (int i = 0; i < numbersFromUser.size(); i++) {
			 if (randomNmbrs.get(i)!=numbersFromUser.get(i) && randomNmbrs.contains(numbersFromUser.get(i))) {
				 console.log("O");
				 countWin = 0;
				 break ;
			 }
		}
		console.logl("");
		 return countWin;
	}
}
