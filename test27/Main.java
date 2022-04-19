class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		B b;

		a1 = new A();
		b = new B();

		a2 = b.bar(a1);

	}
}

class A {}

class B {
	public A bar(A x) {
		return x;
	}
}

/*
 * 1
 * Main.main
 * 1
 * a1,a2
 */
