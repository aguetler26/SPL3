public class FizzBuzz {
	public static void main(String[] args) {
//		for (int n = 1; n <= 100; n++) {
//			FizzerBuzzer(n); // bei 4: fizzer, bei 7: buzzer
//		}
		
		for (int n = 0; n <= 100; n+=4) {
			FizzerBuzzer(n, false);
		}
	}
	
	public static void FizzerBuzzer(int n, boolean showFizzBuzz) {
		if (n % 4 == 0 && n % 7 == 0 && showFizzBuzz == true) {
			System.out.print("FizzerBuzzer ("+ n + ")");
		} else if (n % 4 == 0) {
			System.out.print("Fizzer ("+ n +")");
		} else if (n % 7 == 0) {
			System.out.print("Buzzer ("+ n + ")");
		} else {
			System.out.print(n);
		}
		System.out.println();
	}
}
