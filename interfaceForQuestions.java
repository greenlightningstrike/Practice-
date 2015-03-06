import java.util.Scanner;

public class interfaceForQuestions {

	public Scanner input;
	public int questionOption;
	Account newUserAccount;
	
	public interfaceForQuestions(){
		questionOption = 0;
		input = new Scanner(System.in);
	}

	public void menu(){
		System.out.println("Dear user,");
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("Create a new Account? (1)");
		System.out.println("Log into existing Account? (2)");
		System.out.println("I am finished? (3)");
		questionOption = input.nextInt();
		
		if (questionOption == 1){
			option1();
		}
		if (questionOption == 2){
			option2();
		}
		if (questionOption == 3){
			System.exit(0);
		}
	}
	
	public void option1(){	
		User newUser  = new User();
		newUserAccount = newUser.returnAccount();
		System.out.println("Your new Account information is:");
		System.out.println(newUserAccount.myAccount());
		System.out.println(newUserAccount.myPassword());
		menu();
	}

	public void option2(){		
		loginInterface newInterface = new loginInterface(newUserAccount);
	}
	
}
