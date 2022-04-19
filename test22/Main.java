//cursory test for multiple indirection scenarios
class Main {
	public static void main(String [] args) {
		A a1;
		A a2;
		F f1;
		F f2;
		F fTemp1;
		F fTemp2;
		G g1;
		G g2;
		G gTemp1;
		G gTemp2;

		a1 = new A(); //a1 -> O1
		a2 = new A(); //a2 -> O2
		f1 = new F(); //f1 -> O3
		f2 = new F(); //f2 -> O4
		g1 = new G(); //g1 -> O5
		g2 = new G(); //g2 -> O6

		f1.g = g1; //(O3.g) -> O5
		a1.f = f1; //(O1.f) -> O3

		f2.g = g2; //(O4,g) -> O6
		a2.f = f2; //(O2,f) -> O4

		a2 = a1; //a2 -> O1,O2

		fTemp1 = a1.f; //fTemp1 -> O3
		fTemp2 = a2.f; //fTemp2 -> O3,O4

		gTemp1 = fTemp1.g; //gTemp1 -> O5
		gTemp2 = fTemp2.g; //gTemp2 -> O5,O6



	}
}

class A {
	F f;
}

class F {
	G g;
}

class G { }

/*
 * 1
 * Main.main
 * 2
 * fTemp1,fTemp2
 * gTemp1,gTemp2
 */

/*
 * YES
 * YES
 */
