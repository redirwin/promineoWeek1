package promineoWeek1;

public class App {

	public static void main(String[] args) {
		
		double lunchPrice = 9.99;
		double cashBeforeLunch = 20.00;
		int numberOfFriends = 45;
		int ageInYears = 40;
		String myFirstName = "David";
		String myLastName = "Irwin";
		char myMiddleInitial = 'J';
			
		double cashAfterLunch = cashBeforeLunch - lunchPrice; 
		float friendsMadePerYear = numberOfFriends / ageInYears;
		String myFullName = myFirstName + " " + myMiddleInitial + ". " + myLastName;
		
		System.out.println("The cost of lunch is $" + lunchPrice + ".");
		System.out.println("I have $" + cashBeforeLunch + " in my wallet.");
		System.out.println("I only have $" + cashAfterLunch + " left after buying lunch." );
		System.out.println("I make friends at the rate of about " + friendsMadePerYear + " per year.");
		System.out.println("My first name is " + myFirstName + ".");
		System.out.println("My last name is " + myLastName + ".");
		System.out.println("My middle initial is " + myMiddleInitial + ".");
		System.out.println("My full name is " + myFullName + ".");
	}

}
