//B.bar is added to the worklist twice, with a different summary each time
class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		B b;
		int ret;

		a1 = new A();
		a2 = new A();
		b = new B();
		ret = b.setCount();

		ret = b.bar(a1,a2);
	}
}

class A {}

class B {
	int count;
	
	public int setCount() {
		B temp;
		int ret;

		temp = this;
		ret = 1;
		temp.count = ret;

		return ret;
	}

	public int bar(A x, A y) {
		int zero;
		int i;
		int ret;
		int one;
		boolean test;
		B temp;

		temp = this;
		i = temp.count;
		zero = 0;
		one = 1;
		ret = 0;

		test = zero < i;

		if(test) {
			i = i - one;
			temp.count = i;
			ret = temp.fooBar(x, y);

		} else { }

		return ret;
	}

	public int fooBar(A p, A q) {
		B temp;
		int ret;

		temp = this;

		ret = temp.bar(q, p);

		return ret;
	}
}

/*
 * 2
 * B.bar
 * 1
 * x,y
 * B.fooBar
 * 1
 * p,q
 */

/*
 * YES
 * YES
 */
