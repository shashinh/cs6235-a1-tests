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

		a2 = new A(); //a2->O1
		a3 = new A(); //a3->O2

		a1 = a2;
		a1 = a3; // a1-> O1,O2

		f1 = new F(); //f1->O3
		a1.f = f1; //(O1,f)->O3; (O2,f)->O3

		f2 = a2.f; //f2->(O1,f)->O3
		f3 = a3.f; //f3->(O2,f)->O3

		f4 = new F(); //f4->O4
		a3.f = f4; //(O2,f)->O3,O4

		f5 = a3.f; //f5->(O2,f)->O3,O4

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
 * f1,f2
 * f1,f3
 * f2,f3
 * f2,f5
 */

/*
 * YES
 * YES
 * YES
 * YES
 */
