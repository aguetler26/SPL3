public class TemperaturMittelwert {

	public static void main(String[] args) {
		int[] temp = new int[1000];
		// 0 bis 40 Grad
		for (int i=0; i < temp.length; i++) {
			temp[i] = (int) (Math.random()*41);
		}
		
		// # Temperaturwerte < 10 Grad
		int unter10Grad = 0;
		for (int i=0; i < temp.length; i++) {
			if (temp[i] < 10) {
				unter10Grad++;
			}
		}
		System.out.println(unter10Grad+" Werte < 10 Grad.");

		// # Temperaturwerte >= 10 und < 20 Grad
		int zwischen10und20Grad = 0;
		for (int i=0; i < temp.length; i++) {
			if (temp[i] >= 10 && temp[i] < 20) {
				zwischen10und20Grad++;
			}
		}
		System.out.println(zwischen10und20Grad+" Werte zwischen 10 und 20 Grad.");

		// # Temperaturwerte >= 10 und < 20 Grad
		int ueber20Grad = 0;
		for (int i=0; i < temp.length; i++) {
			if (temp[i] >= 20) {
				ueber20Grad++;
			}
		}
		System.out.println(ueber20Grad+" Werte über 20 Grad.");

		System.out.println("Gesamt Werte: " + (ueber20Grad + zwischen10und20Grad + unter10Grad));
		
		// mit Unterprogrammen auswerten!
		System.out.println(getTemperaturWerteAnzahl(temp, 0, 10) + " Werte unter 10 Grad.");
		System.out.println(getTemperaturWerteAnzahl(temp, 10, 20) + " Werte zwischen 10 und 20 Grad.");
		System.out.println(getTemperaturWerteAnzahl(temp, 20, 41) + " Werte über 20 Grad.");

	}
	
	public static int getTemperaturWerteAnzahl(int tempWert[], int von, int bis) {
		int anzahl = 0;
		for (int t = 0; t < tempWert.length; t++) {
			if (tempWert[t] >= von && tempWert[t] < bis) {
				anzahl++;
			}
		}
		return anzahl;
	}
}
