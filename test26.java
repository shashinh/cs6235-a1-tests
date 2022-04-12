class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		B b;

		a1 = new A();
		a2 = new A();
		b = new B();
		a3 = b.bar(a1,a2);
	}
}

class A {}

class B {
	public A bar(A x, A y) {
		return x;
	}
}

class C extends B {
	public A bar(A x, A y) {
		return y;
	}
}

/*
 * 1
 * Main.main
 * 1
 * a1,a3
 * a2,a3
 */

/*
 * YES
 * YES
 */
