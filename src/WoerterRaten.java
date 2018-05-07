import javax.swing.JOptionPane;

public class WoerterRaten {
	public static void main (String[] args) {
		
		// 1. Wort einlesen (eingeben)
		String wort = JOptionPane.showInputDialog("Bitte das zu erratende Wort eingeben:");
		char[] buchstaben = wort.toCharArray();
		// 2. Nachbar soll das Wort erraten

		System.out.println("Das gesuchte Wort hat " + wort.length() + " Buchstaben.");
		
		boolean erraten = false;
		while (erraten == false) {
			String raten = JOptionPane.showInputDialog("Welcher Buchstabe?");
			char[] zeichenfolge = raten.toCharArray();
			char zeichen = zeichenfolge[0];
			
		// Ablauf
		// Wort = "Vanilleeis"
		// Das Wort hat 10 Buchstaben
		
		// Bitte raten:
		// e
		// Ausgabe: ******ee**
		
		// Bitte raten:
		// i
		// Ausgabe: ***i**eei*
		}
		
	}
}
