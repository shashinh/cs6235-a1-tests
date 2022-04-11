class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		int ten;
		int zero;
		int one;
		boolean test;

		a2 = new A();
		a3 = new A();

		ten = 10;
		zero = 0;
		one = 1;
		test = zero < ten;

		while(test) {
			a1 = a2;
			a2 = a3;

			ten = ten - one;
			test = zero < ten;
		}


	}
}

class A {}

/*
 * 1
 * Main.main
 *
 * a1,a2
 * a1,a3
 * a2,a3
 */

/*
 * YES
 * YES
 * YES
 */
