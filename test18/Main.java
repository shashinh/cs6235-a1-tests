class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		F f;
		B b;
		int ret;

		a1 = new A();
		f = new F();
		a1.f = f;
		a2 = a1;
		b = new B();

		ret = b.foo(a1,a2);

	}
}

class A {
	F f;
}

class F {}

class B {
	public int foo(A x, A y) {
		int one;
		F f1;
		F f2;

		f1 = x.f;
		f2 = y.f;
		one = 1;
		
		return one;
	}
}

/*
 * 1
 * B.foo
 * 1
 * f1,f2
 */

/*
 * YES
 */
