class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		int ten;
		int zero;
		int one;
		int i;
		int ret;
		B b;

		a2 = new A();
		a3 = new A();
		b = new B();

		ten = 10;
		zero = 0;
		one = 1;

		for(i = zero; i < ten; i = i + one) {
			a1 = a2;
			a2 = a3;

			ret = b.bar(a1,a2,a3);
		}


	}
}

class A {}

class B {
	public int bar(A x, A y, A z) {
		int ret;
		ret = 1;

		return ret;
	}
}

/*
 * 2
 * Main.main
 * 3
 * a1,a2
 * a1,a3
 * a2,a3
 * B.bar
 * 3
 * x,y
 * x,z
 * y,z
 */

/*
 * YES
 * YES
 * YES
 * YES
 * YES
 * YES
 */
