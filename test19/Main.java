class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		F f1;
		F f2;
		int ret;
		B b;

		a1 = new A();
		f1 = new F();
		a1.f = f1;
		a2 = new A();

		b = new B();
		ret = b.foo(a1,a2);

		f2 = a2.f;

	}
}

class A {
	F f;
}

class F {}

class B {
	public int foo(A x, A y) {
		F temp;
		int one;

		temp = x.f;
		y.f = temp;

		one = 1;

		return one;
	}
}

/*
 * 1
 * Main.main
 * 1
 * f1,f2
 */

/*
 * YES
 */
