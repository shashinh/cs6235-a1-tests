class Main {
	public static void main(String [] args) {
		A a;
		F f1;
		F f2;
		F fTemp;

		a = new A();
		f1 = new F();
		a.f = f1;
		f2 = new F();
		fTemp = a.f;
	}
}

class A {
	F f;
}

/*
 * 1
 * Main.main
 * 1
 * fTemp,f2
 */

/*
 * NO
 */
