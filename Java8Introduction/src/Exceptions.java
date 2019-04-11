public class Exceptions {

	public static void main(String[] args) throws KuroshNotFoundException {

		/*
		 * if (!"Alibaba".equals("Kurosh")) { throw new
		 * KuroshNotFoundException("Where is Kurosh?"); }
		 */

		try {
			String tester = "1.2";
			int i = Integer.parseInt(tester);

		} catch (NumberFormatException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally");
		}

	}

}
