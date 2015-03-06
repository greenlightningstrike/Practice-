
public class Account {
	
	private String accountName;
	private String parole;
	public String userNameVerifier;
	public String passwordVerifier;
			
	public Account(userName x, Password y){
		accountName = x.returnUserName();
		parole = y.returnPassword();
	}
		
	public String myPassword(){
		return parole;
	}
		
	public String myAccount(){
		return accountName;
	}
		
	public boolean checkPassword(String x){
		passwordVerifier = x;
		if (passwordVerifier.equals(parole)){
			return true;
		} else {
			return false;
		}
	}
		
	public boolean checkUserName(String x){
		userNameVerifier = x;
		if (userNameVerifier.equals(accountName)){
			return true;
		} else {
			return false;
		}				
	}
}
