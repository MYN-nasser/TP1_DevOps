public class test {
	public static void main(String[] args) {
		testAddition();
		System.out.println("Tous les tests sont passes.");
	}

	private static void testAddition() {
		assertEquals(4, 2 + 2, "2 + 2 doit valoir 4");
	}

	private static void assertEquals(int expected, int actual, String message) {
		if (expected != actual) {
			throw new AssertionError(message + " (attendu : " + expected + ", obtenu : " + actual + ")");
		}
	}
}
