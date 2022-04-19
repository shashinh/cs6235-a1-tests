class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		int ret;
		
		a1 = new A();
		ret = a1.foo();
		a2 = a1.f;	
		
	}
}


class A {
	A f;
	public int foo() {
		A x;
		int ret;
		x = this;
		
		x.f = x;
		ret = 0;
		return ret;
	}
}




/*
 * 1
 * Main.main
 * 1
 * a1,a2
 */

/*
 * YES
 */
