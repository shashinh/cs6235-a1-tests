class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		int ret;

		a1 = new A();
		a2 = new A();

		ret = a1.foo(a2);

		a3 = a1.f;

	}
}

class A {
	A f;

	public int foo(A x) {
		int one;
		A temp;

		temp = this;
		temp.f = x;
		one = 1;

		return one;
	}
}

/*
 * 1
 * Main.main
 * 1
 * a2,a3
 */

/*
 * YES
 */
