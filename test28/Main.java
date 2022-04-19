class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		B b;

		a1 = new A();
		a2 = new A();
		b = new B();
		a3 = b.bar(a1,a2);

	}
}

class A {}

class B {
	public A bar(A x, A y) {
		int one;
		int zero;
		boolean test;
		A ret;

		one = 1;
		zero = 0;
		test = zero < one;

		/*
		 * Unfortunately, the grammar doesn't support multiple returns
		if(test) {
			return x;
		} else { 
			return y;
		} */

		if(test) {
			ret = x;
		} else {
			ret = y;
		}

		return ret;
	}
}

/*
 * 1
 * Main.main
 * 2
 * a3,a1
 * a3,a2
 */

/*
 * YES
 * YES
 */
