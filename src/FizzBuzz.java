public class FizzBuzz {
	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			FizzerBuzzer(n); // bei 4: fizzer, bei 7: buzzer
		}
	}
	
	public static void FizzerBuzzer(int n) {
		if (n % 4 == 0 && n % 7 == 0) {
			System.out.print("FizzerBuzzer ");
		} else if (n % 4 == 0) {
			System.out.print("Fizzer ");
		} else if (n % 7 == 0) {
			System.out.print("Buzzer ");
		} else {
			System.out.print(n);
		}
		System.out.println();
	}
}
