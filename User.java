import java.util.Scanner;

public class User {
		
		public userName user;
		public Password hisPassword;
		public Scanner input;
		Account newAccount;
		
	public User(){
		input = new Scanner(System.in);
		makeUserName();
		makePassword();	
		makeAccount();	
	}
	
	public void makeUserName(){
		System.out.println("User, please enter your username");
		String aNewName = input.nextLine();
		user = new userName(aNewName);
	}
	
	public void makePassword(){
		System.out.println("User, please enter your password");
		String userPassword = input.nextLine();
		hisPassword = new Password(userPassword);
	}
	
	public void makeAccount(){
		newAccount = new Account(user, hisPassword);
	}
	
	public Account returnAccount(){
		return newAccount;
	}
}
