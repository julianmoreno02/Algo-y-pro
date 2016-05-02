package models;

public class WordCounter{

private int spaceNumber = 1;
	
	public int getWordNumber(String cadena, char space){

		for (int i = 0;i < cadena.length();i ++) {
			if (cadena.charAt(i) == space) {
				spaceNumber++;
			}
		}
		return spaceNumber;
	}

	public static void main(String[] args) {
		WordCounter counter = new WordCounter();
		System.out.println("Las palabras encontradas fueron: " + counter.getWordNumber("cuantas palabras hay en esta frase", ' '));

	
	}
}