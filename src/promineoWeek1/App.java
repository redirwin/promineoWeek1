package promineoWeek1;

public class App {

	public static void main(String[] args) {
		
		// First 10 Variables
		
		// These 7 variables are hard coded.
		double lunchPrice = 9.99;
		double cashBeforeLunch = 20.00;
		int numberOfFriends = 45;
		int myAgeInYears = 40;
		String myFirstName = "David";
		String myLastName = "Irwin";
		char myMiddleInitial = 'J';
		
		// These three variables are calculated from the ones above.
		double cashAfterLunch = cashBeforeLunch - lunchPrice; 
		float friendsMadePerYear = numberOfFriends / myAgeInYears;
		String myFullName = myFirstName + " " + myMiddleInitial + ". " + myLastName;
		
		// Displaying all 10 variables.
		System.out.println("About Me");
		System.out.println("The cost of lunch is $" + lunchPrice + ".");
		System.out.println("I have $" + cashBeforeLunch + " in my wallet.");
		System.out.println("I only have $" + cashAfterLunch + " left after buying lunch." );
		System.out.println("I have about " + numberOfFriends + " close friends.");
		System.out.println("I am " + myAgeInYears + " years old.");
		System.out.println("I make friends at the rate of about " + friendsMadePerYear + " per year.");
		System.out.println("My first name is " + myFirstName + ".");
		System.out.println("My last name is " + myLastName + ".");
		System.out.println("My middle initial is " + myMiddleInitial + ".");
		System.out.println("My full name is " + myFullName + ".");
		System.out.println("\n");
		
		// Second 10 Variables
		
		// These 7 variables are hard coded.
		double dinnerPrice = 17.59;
		double cashBeforeDinner = 35.00;
		int numberOfWifesFriends = 200;
		int wifesAgeInYears = 38;
		String wifesFirstName = "April";
		String wifesLastName = "Irwin";
		char wifesMiddleInitial = 'M';
		
		// These three variables are calculated from the ones above.
		double cashAfterDinner = cashBeforeDinner - dinnerPrice; 
		float wifesFriendsMadePerYear = numberOfWifesFriends / wifesAgeInYears;
		String wifesFullName = wifesFirstName + " " + wifesMiddleInitial + ". " + wifesLastName;
		
		// Displaying all 10 variables.
		System.out.println("About My Wife");
		System.out.println("The cost of dinner is $" + dinnerPrice + ".");
		System.out.println("My wife has $" + cashBeforeDinner + " in her wallet.");
		System.out.println("She has $" + cashAfterDinner + " left after buying dinner." );
		System.out.println("She has about " + numberOfWifesFriends + " close friends.");
		System.out.println("She is " + wifesAgeInYears + " years old.");
		System.out.println("She makes friends at the rate of about " + wifesFriendsMadePerYear + " per year.");
		System.out.println("Her first name is " + wifesFirstName + ".");
		System.out.println("Her last name is " + wifesLastName + ".");
		System.out.println("Her middle initial is " + wifesMiddleInitial + ".");
		System.out.println("Her full name is " + wifesFullName + ".");	 	
			
	}
}
