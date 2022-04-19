class Main {
	public static void main(String [] args) {
		A a;
		F f1;
		F f2;
		F fTemp1;
		F fTemp2;
		int ret;

		a = new A();
		f1 = new F();
		ret = a.set(f1);

		f2 = a.get();


	}
}

class A {
	F f;

	public F get() {
		F ret;
		A temp;

		temp = this;
		ret = temp.f;

		return ret;
	}

	public int set(F x) {
		int ret;
		A temp;

		temp = this;
		temp.f = x;
		ret = 1;

		return ret;
	}
}

class F { }

/*
 * 1
 * Main.main
 * 1
 * f1,f2
 */

/*
 * YES
 */
