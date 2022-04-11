class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		F f1;
		F f2;
		F f3;
		F f4;
		F f5;
		F temp1;
		F temp2;
		int ten;
		int zero;
		int one;
		boolean test;

		a1 = new A();
		a2 = new A();
		a3 = new A();
		
		f2 = new F();
		f3 = new F();

		a2.f = f2;
		a3.f = f3;

		ten = 10;
		zero = 0;
		one = 1;
		test = zero < ten;

		while(test) {
			temp1 = a2.f;
			a1.f = temp1; //a1.f = a2.f

			temp2 = a3.f;
			a2.f = temp2; //a2.f = a3.f

			ten = ten - one;
			test = zero < ten;
		}

		f1 = a1.f;
		f4 = a2.f;
		f5 = a3.f;


	}
}

class A {
	F f;
}

class F {}

/*
 * 1
 * Main.main
 * 4
 * f1,f4
 * f1,f5
 * f4,f5
 * f2,f5
 */

/*
 * YES
 * YES
 * YES
 * NO
 */
