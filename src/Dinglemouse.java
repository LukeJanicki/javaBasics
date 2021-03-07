public class Kata {

	public static String well(String[] x) {
		int count = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] == "good") {
				count++;
			}
		}

		if (count > 2) {
			return "I smell a series!";
		}
		if (count > 0) {
			return "Publish!";
		}
		if (count == 0) {
			return "Fail!";
		}
	}

}