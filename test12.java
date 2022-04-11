class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		F f1;
		F f2;
		F f3;

		a2 = new A();
		a3 = new A();

		a1 = a2;
		a1 = a3;

		f1 = new F();
		a1.f = f1;

		f2 = a2.f;
		f3 = a3.f;

	}
}

class A {
	F f;
}

class F {}

/*
 * 1
 * Main.main
 * 3
 * f1,f2
 * f1,f3
 * f2,f3
 */

/*
 * YES
 * YES
 * YES
 */
