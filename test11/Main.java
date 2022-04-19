class Main {
	public static void main(String [] args) {
		A a1;
		A a2;

		F f1;
		F f2;

		a1 = new A();
		a2 = new A();
		f1 = new F();

		a1.f = f1;
		a2 = a1;

		f2 = a2.f;


	}
}

class A {
	F f;
}

class F {}

/*
 * 1
 * Main.main
 * 1
 * f1,f2
 */

/*
 * YES
 */
