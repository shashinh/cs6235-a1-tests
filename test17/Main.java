class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		B b;
		int ret;

		a1 = new A();
		a2 = a1;
		b = new B();

		ret = b.foo(a1,a2);

	}
}

class A {}

class B {
	public int foo(A x, A y) {
		int one;
		one = 1;
		
		return one;
	}
}

/*
 * 1
 * B.foo
 * 1
 * x,y
 */

/*
 * YES
 */
