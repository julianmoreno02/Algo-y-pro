package models;

public class VerifyNumber{
	
	public void binaryVerificator(int userInput){
		if (userInput == (1)||(0)) {
			System.out.println("El numero es binario");
		}else{
			System.out.println("El numero no es binario");
		}

		}
	
	public static void main(String[] args) {
		VerifyNumber game = new VerifyNumber();
		game.binaryVerificator(352);
	}
}