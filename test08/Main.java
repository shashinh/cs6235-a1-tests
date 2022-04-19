class Main {
	public static void main(String [] args) {
		A a;
		F f1;
		F f2;
		F f3;
		F f4;

		int zero;
		int one;
		boolean test;

		zero = 0;
		one = 1;
		test = zero < one;
		
		a = new A();
		f1 = new F();
		f2 = new F();

		if(test) {
			a.f = f1;
		} else {
			a.f = f2;
		}

		f3 = a.f;
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
 * NO
 * YES
 * YES
 */
