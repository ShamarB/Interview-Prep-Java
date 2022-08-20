package Arrays;

public class ValidateSubsequence {

	public static void main(String[] args) {
		int[] array = {5, 1, 22, 25, 6, -1, 8, 10};
		int[] sequence = {1, 6, -1, 1, 1, 1, 1, 1, 1, 1, 1};
		boolean ans = validateSub(array, sequence);
		System.out.println(ans);
	}
	
	public static boolean validateSub(int[] array, int[] sequence) {
		int i = 0;
		int j = 0;
		while (i < array.length) {
			if (sequence[j] == array[i]) {
				j++;
				i++;
			} else {
				i++;
			}
		}
		if (j == sequence.length) {
			return true;
		} else {
			return false;
		}
	}

}
