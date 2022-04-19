class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		F f1;
		F f2;
		F f3;
		F f4;

		a1 = new A();
		a2 = new A();
		f1 = new F();
		a1.f = f1;
		f2 = new F();
		a2.f = f2;

		f3 = a1.f;
		f4 = a2.f;
	}
}

class A {
	F f;
}

class F { }

/*
 * 1
 * Main.main
 * 5
 * f1,f2
 * f1,f3
 * f1,f4
 * f2,f3
 * f2,f4
 */

/*
 * NO
 * YES
 * NO
 * NO
 * YES
 */
