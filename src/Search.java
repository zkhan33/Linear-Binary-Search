
public class Search {
	public static int linear(int[] a, int key) {
		boolean found = false;
		System.out.println("Linear Search: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) {
				found = true;
				System.out.println("Value was found at index: " + i);
				break;
			}
		}
		if (!found) {
			System.out.println("Value was not found in the array");
		}
		System.out.println();

		return 0; // TODO

	}

	public static int binary(int[] a, int key) {
		int start = 0, end = a.length - 1;
		boolean found = false;
		System.out.println("Binary Search: ");
		while (start <= end) {
			int mid = start + ((end - start) / 2);
			if (a[mid] == key) {
				found = true;
				System.out.println("Value was found at index: " + mid);
				break;
			} else if (key < a[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		if (!found) {
			System.out.println("Value was not found in the array");
		}

		System.out.println();
		return 0; // TODO
	}

}
