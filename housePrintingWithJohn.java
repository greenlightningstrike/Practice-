import java.util.Scanner;
public class housePrintingWithJohn {
	
	public static void main(String args[]) {
	
	System.out.println("Please enter the height of the house(Increments of 7)");
	Scanner input = new Scanner(System.in);
	int height = input.nextInt();
	Banana m = new Banana(height);	

 	m.printTop();
	m.printBottom();
	m.algorithmicHouseTop();
	m.algorithmicHouseBottom();
	
	}
}
