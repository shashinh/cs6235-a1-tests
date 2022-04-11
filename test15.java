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
		F temp;
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
			temp = a2.f;
			a1.f = temp; //a1.f = a2.f

			temp = a3.f;
			a2.f = temp; //a2.f = a3.f

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
 * 
 *
 */

