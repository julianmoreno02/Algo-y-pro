package models;

public class SymbolCounter{

	public int getSymbolsNumber(String cadena, char symbol){

		private int symbolsNumber;

		for (int i = 0;i < cadena.length(); i++) {
			if (cadena.charAt(i) == symbol) {
				symbolsNumber++;
			}
		}
		return symbolsNumber;
	}

	public static void main(String[] args) {
		SymbolCounter counter = new SymbolCounter();
		System.out.println("El simbolo que busca se encuentra: " + counter.getSymbolsNumber("Hola compañeros", 'o'));

	}

}