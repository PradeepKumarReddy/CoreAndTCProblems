public class MethodOverload {

	public void m1(String s) {
		System.out.println("String " + s);
	}

	public void m1(Object s) {
		System.out.println("Object " + s);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MethodOverload overload = new MethodOverload();
		overload.m1(null);
	}

}
