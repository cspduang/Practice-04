import java.util.Random;

public class SelectionSort implements SortingAlgorithm {
	@Override
	public void sort(int[] a) {
		int size = a.length;
		for (int i = 0; i < size - 1; i++) {
			int idx = i, j;
			for (j = i + 1; j < size; j++) {
				if (a[j] < a[idx]) {
					idx = j;
				}
			}

			int temp = a[idx];
			a[idx] = a[i];
			a[i] = temp;
		}
	}

	public static void main(String[] args) {
		final int size = 10;
		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = random.nextInt(20);
		}

		new SelectionSort().sort(a);
		for (int temp : a) {
			System.out.println(temp);
		}
	}
}
