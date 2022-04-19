class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		int ret;
		
		a1 = new A();
		ret = a1.foo();
		a2 = a1.f;	
		
		ret = a1.bar(a2);
		
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
	
	public int bar(A x) {
		int ret;
		A temp;
		
		temp = this;
		//a2.bar(a1) - bar need not be added to worklist again
		ret = x.bar(temp);
		
		return ret;
	}
		
}




/*
 * 1
 * A.bar
 * 1
 * temp,x
 */

/*
 * YES
 */
