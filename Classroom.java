class Classromm{
	public static void main(String[] args) {
	
	//creating new instances of the Wilder class
	Wilder wilder1 = new Wilder ("Sébastien");
	Wilder wilder2 = new Wilder ("Razzak", true);
	Wilder wilder3 = new Wilder ("Ronald", false);

	//using setters
	wilder3.setAware(true);

	//using method
	System.out.println(wilder1.whoAmI());
	System.out.println(wilder2.whoAmI());
	System.out.println(wilder3.whoAmI());

	}
}
