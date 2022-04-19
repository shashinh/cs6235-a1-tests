class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		A a3;
		C c;
		B b;

		a1 = new A();
		a2 = new A();
		b = new B();
		c = new C();
		a3 = b.bar(a1,a2);
		a3 = c.bar(a2, a1);
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
 * 2
 * B.bar
 * 1
 * x,y
 * C.bar
 * 1
 * x,y
 */

/*
 * NO
 * YES
 */
