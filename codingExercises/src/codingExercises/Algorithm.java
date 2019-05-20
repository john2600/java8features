package codingExercises;

public class Algorithm {
	public void solve(int[] n) {
		int lastNumber = n[n.length - 1];

		int[] tmpArray = new int[lastNumber];

		for (int x = 1; x < n.length; x++) {
			int value = n[x - 1];
			tmpArray[value] = 1;
		}

		for (int i = 1; i < lastNumber; i++) {
			if (tmpArray[i] == 0) {
				System.out.println("numero pendiente " + i);
			}

		}

	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 ,5};

		Algorithm n = new Algorithm();
		n.solve(numbers);
	}

}
