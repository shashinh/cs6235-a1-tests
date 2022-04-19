class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		int ten;
		int zero;
		int one;
		int i;

		a2 = new A();
		a3 = new A();

		ten = 10;
		zero = 0;
		one = 1;

		for(i = zero; i < ten; i = i + one) {
			a1 = a2;
			a2 = a3;
		}


	}
}

class A {}

/*
 * 1
 * Main.main
 * 3
 * a1,a2
 * a1,a3
 * a2,a3
 */

/*
 * YES
 * YES
 * YES
 */
