class Main {
	public static void main(String [] args) {
		A a;
		F f1;
		F f2;

		a = new A();
		f1 = new F();
		a.f = f1;
		f2 = a.f;
	}
}

class A {
	F f;
}

class F { }

/*
 * 1
 * Main.main
 * 1
 * f1,f2
 */
