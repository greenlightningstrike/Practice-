public class Banana {
		
	public int heightOfHouse;
	public int middle;
	
	public Banana(int dimension){
		heightOfHouse = dimension;
		middle = (dimension + 1) / 2;
	}
	public void printTop(){


				System.out.printf("%3d","+");
				System.out.println("");
				
				System.out.printf("%2d","+ +");
				System.out.println("");

				System.out.printf("%1d","+   +");
				System.out.println("");

				System.out.println("+_____+");
			
	}
	
/*	public void printBottom(){

		if (heightOfHouse ==7){
			
		}
	}	
*/
}
 