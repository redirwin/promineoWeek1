package promineoWeek1;

public class App {

	public static void main(String[] args) {
		
		double itemPrice = 9.99;
		double cashInWallet = 20.00;
		int numberOfFriends = 45;
		int ageInYears = 40;
		String firstName = "David";
		String lastName = "Irwin";
		char middleInitial = 'J';
		
		double walletAfterPurchase = cashInWallet - itemPrice; 
		double friendsMadePerYear = numberOfFriends / ageInYears;
		String fullName = firstName + " " + middleInitial + ". " + lastName;
		
		System.out.println("I only have $" + walletAfterPurchase + " left after buying lunch." );
		System.out.println("I make friends at the rate of about " + friendsMadePerYear + " per year.");
		System.out.println("My full name is " + fullName + ".");
		
	}

}
