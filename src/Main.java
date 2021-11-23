class Main  {
	public static void main(String[] args)
	{ 
		int countWin ;
		int repeat =0 ;
		countWin =CheckClass.check(RandomNb.getrandomNmbrs(), NumbersFromUser.getnumbersFromUser());
		
		while (repeat < 2) {
			if(countWin == 4) {
			System.out.print("lucky !");
			break ;
		}else {
			repeat ++ ;
			System.out.println("Sorry Man You Need To have Four # !");
			CheckClass.check(RandomNb.getrandomNmbrs(), NumbersFromUser.getnumbersFromUser());
		 }
			repeat++;
			System.out.println("Sorry You d'ont have other Chance");
		}
	}
}
