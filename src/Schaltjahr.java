import javax.swing.JOptionPane;

public class Schaltjahr {

//	Vergangene Schaltjahre
//	1880, 1884, 1888, 1892, 1896, 1904, 1908
//	1912, 1916, 1920, 1924, 1928, 1932, 1936
//	1940, 1944, 1948, 1952, 1956, 1960, 1964
//	1968, 1972, 1976, 1980, 1984, 1988, 1992
//	1996, 2000, 2004, 2008, 2012, 2016
//
//	Kommende Schaltjahre
//	2020, 2024, 2028, 2032, 2036, 2040, 2044
//	2048, 2052, 2056, 2060, 2064, 2068, 2072
//	2076, 2080, 2084, 2088, 2092, 2096, 2104
//	2108, 2112, 2116, 2120, 2124, 2128, 2132 
	
	public static void main(String[] args) {
		// Jahr eingeben
		String jahr = JOptionPane.showInputDialog("Jahreszahl?");
		int year = Integer.parseInt(jahr); 
		// Überprüfen, ob ein Schaltjahr
		// mit Funktionen!
		
		// z.B. 2016 ist ein Schaltjahr
		if (istSchaltjahr(year)) {
			System.out.println(year+" ist ein Schaltjahr.");
		} else {
			System.out.println(year+" ist KEIN Schaltjahr.");
		}		
	}
	
	public static boolean istSchaltjahr(int jahreszahl) {
		if (jahreszahl % 4 == 0) {
			if (jahreszahl % 100 != 0 || jahreszahl % 400 == 0) {
				return true;
			}
		}
		return false;
	}

}
