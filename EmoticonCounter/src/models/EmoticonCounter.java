package models;

public class EmoticonCounter{

	private int emoticonsNumber;

	public int getEmoticonsNumber(String cadena, char emoticonOne, char emoticonTwo){

		for (int i = 0;i < cadena.length(); i++) {
			if ((cadena.charAt(i) == emoticonOne) && (cadena.charAt(i + 1) == emoticonTwo)) {
				emoticonsNumber++;
			}
		}
		return emoticonsNumber;
	}

	public static void main(String[] args) {
		EmoticonCounter counter = new EmoticonCounter();
		System.out.println("El emoticon que busca se encuentra: " + counter.getEmoticonsNumber("Que pasa :v compañeros :v bien o no :v", ':', 'v'));

	}

}