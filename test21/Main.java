class Main {
	public static void main(String [] args) {
		A a;
		F f1;
		F f2;
		F f3;
		B b;
		int ret;

		a = new A();
		f1 = new F();
		f2 = new F();

		b = new B();
		ret = b.foo(a, f1, f2);

		f3 = a.f;
	}
}

class A {
	F f;
}

class F {}

class B {
	public int foo(A x, F u, F v) {
		int one;

		x.f = u;
		one = 1;

		return one;
	}
}

class C extends B {
	public int foo(A x, F u, F v) {
		int one;

		x.f = v;
		one = 1;

		return one;
	}
}
	

/*
 * 1
 * Main.main
 * 1
 * f1,f3
 * f2,f3
 */

/*
 * YES
 * YES
 */
