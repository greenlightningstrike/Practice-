public class Banana {
		
	public int length;
	public int middle;
	public int quarter;
	public int baseLengthTriangle;
	public int baseHeight;
	
	public Banana(int dimension){
		length = dimension;
		middle = (dimension + 1) /2;
		quarter = (dimension + 1) /4; 
		baseLengthTriangle = (dimension + 2)/2;	
		baseHeight = (dimension -1)/2;

	}
	public String space(){
		String barry = " ";
		return barry;
	}
	public String plus(){
		String harry = "+";
		return harry;
	}
	public String minus(){
		String marry = "-";
		return marry;
	}
	public String bar(){
		String crazy = "|";
		return crazy;
	}

	public void printTop(){
		System.out.println(space()+space()+space()+plus());
		System.out.println(space()+space()+plus()+space()+plus());
		System.out.println(space()+plus()+space()+space()+space()+plus());
		System.out.println(plus()+minus()+minus()+minus()+minus()+minus()+plus());
	}
	public void printBottom(){
		System.out.println(bar()+space()+space()+space()+space()+space()+bar());
		System.out.println(bar()+space()+space()+space()+space()+space()+bar());
		System.out.println(bar()+space()+space()+space()+space()+space()+bar());
		System.out.println(plus()+minus()+minus()+minus()+minus()+minus()+plus());
	}

	public void algorithmicHouseTop(){
		int decreaseDimension = baseHeight;
		int increaseDimension = 1;

		for (int i = 0; i < baseHeight; i++){
			for (int j = 0; j < decreaseDimension; j++){		
				System.out.print(space());
			}
			if (i == 0){
				System.out.println(plus());
			}
			else{
				System.out.print(plus());
				for (int  k = 0; k<increaseDimension;k++) {
					System.out.print(space());				
				}
		System.out.println(plus());	
			}
		decreaseDimension--;

			if (i == 0 ){
				increaseDimension = increaseDimension;
			} 
			else {
				increaseDimension+=2;
			}

		}
	}

	public void algorithmicHouseBottom(){
		for (int j = 0; j <= quarter; j++){
			if (j == 0){
				System.out.print(plus());
				for (int i = 0; i< length-2; i++){
					System.out.print(minus());
				}
				System.out.println(plus());
			}	

			for (int i = 0; i < length-2; i++){
				
				if (i == 0){
					System.out.print(bar());
				}
				System.out.print(space());
				if (i == length -3){
					System.out.println(bar());
				}
			}
			if (j == quarter){
				System.out.print(plus());
				for (int i = 0; i< length-2; i++){
					System.out.print(minus());
				}
				System.out.println(plus());
			}
		}
	}
}
