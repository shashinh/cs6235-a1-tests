class Main {
	public static void main (String [] args) {
		A a1;
		A a2;
		A a3;

		a1 = new A();
		a2 = new A();
		a3 = new A();
		
		a3 = a1;
		a3 = a2;
	}
}

class A { }

//test the flow insensitivity
/*
 * 1
 * Main.main
 * 2
 * a1,a3
 * a2,a3
 */
