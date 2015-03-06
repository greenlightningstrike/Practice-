import java.util.Scanner;

public class loginInterface {
	
		Scanner input;
		String userName;
		String parole;
		Account userAccount;
		boolean passwordChecker;
		boolean accountNameChecker;
		
	public loginInterface(Account importedUser){
		passwordChecker = false;
		accountNameChecker = false;
		input = new Scanner(System.in);
		userAccount = importedUser;
		accountInput();
	}
	
	public void accountInput(){
		System.out.println("Your account information is");
		System.out.println(userAccount.myAccount());
		System.out.println(userAccount.myPassword());
		System.out.println("Please enter your username:");
		userName = input.nextLine();
		System.out.println("Please enter your password:");
		parole = input.nextLine();
		accountVerification();	
	}
	public void accountVerification(){

			accountNameChecker = userAccount.checkUserName(userName);
			passwordChecker = userAccount.checkPassword(parole);				

		if (accountNameChecker == true && passwordChecker == true){
			accountDetailsRight();
		}
		if (accountNameChecker ==  false || passwordChecker == false){
			accountDetailsWrong();
		}
	}
	
	public void accountDetailsWrong(){
		System.out.println("Sorry, you entered the wrong information! Please try again.");
		accountInput();

	}
	
	public void accountDetailsRight(){
		System.out.println("Congratulations! You are logged in!");
		System.out.println("You used " + userName + " as your username and");
		System.out.println("you used " + parole + " as your password");
		System.out.println("");
		System.out.println("Would you like to do anything else Y(1), N(2)?");
		int theOption = input.nextInt();
		if(theOption == 1){
			nextOperation();
		}
		else {
			System.exit(0);
		}
	}
	public void nextOperation(){
		interfaceForQuestions newInterface = new interfaceForQuestions();
		newInterface.menu();
	}
}
