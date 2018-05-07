public class FizzBuzz {
	public static void main(String[] args) {
		for (int n = 1; n <= 100; n++) {
			FizzBuzz(n);
		}
		System.out.println("ende!");
	}
	
	public static void FizzBuzz(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			System.out.print("FizzBuzz ");
		} else if (n % 3 == 0) {
			System.out.print("Fizz ");
		} else if (n % 5 == 0) {
			System.out.print("Buzz ");
		} else {
			System.out.print(n);
		}
		System.out.println();
	}
}
