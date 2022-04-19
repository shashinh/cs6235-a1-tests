class Main {
	public static void main (String [] args) {
		A a1;
		A a2;
		A a3;
		a1 = new A();
		a2 = a1;
		a3 = a2;
	}
}

class A { }

/*
 * 1
 * Main.main
 * 3
 * a1,a2
 * a2,a3
 * a1,a3
 */
