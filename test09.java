class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;

		int zero;
		int one;
		boolean test;

		zero = 0;
		one = 1;
		test = zero < one;
		
		a1 = new A();
		a2 = new A();

		if(test) {
			a1 = a2;
		} else {
			a1 = a3;
		}

	}
}

class A {
}


/*
 * 1
 * Main.main
 * 3
 * a1,a2
 * a1,a3
 * a2,a3
 */

/*
 * NO
 * YES
 * YES
 */
