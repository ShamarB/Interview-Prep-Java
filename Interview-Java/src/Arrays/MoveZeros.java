package Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		//    {0 1 0 3 12}
		//    {0 0 1 3 12}
		//    {1 3 12 0 0}
		
		int[] array = {1,3,3,0,2,0,6,9,5,0,7}; // 1 3 3 2 6 9 5 7 0 0 0 
		array = moveLeft(array);
		printArray(array);
	}
	
	public static int[] moveRight2(int[] array) {
		int i = 0;
		int j = 0;
		
		while (j < array.length) {
			if (array[j] == 0) {
				j++;
			} else {
				swap(array, i, j);
				i++;
				j++;
			}
		}
		return array;
	}
	
	
	public static int[] moveLeft2(int[] array) {
		int i = array.length - 1;
		int j = array.length - 1;
		
		while (i >= 0) {
			if (array[i] != 0) {
				array[j] = array[i];
				j--;
			}
			i--;
		}
		
		while (j >= 0) {
			array[j] = 0;
			j--;
		}
		return array;
	}
	
	
	

	
	
	
	public static int[] moveRight(int[] array) {
		if(array.length == 0 || array.length == 1)
			return array;
		
		int left = 0;
		int right = 0;
		while(right < array.length) {
			if(array[right] == 0) {
				right++;
			} else {
				swap(array, left, right);
				left++;
				right++;
			}
		}
		return array;
	}
	
	
	public static int[] moveLeft(int[] array) {
		if (array.length == 0 || array.length == 1)
			return array;
		
		int left = array.length - 1;
		int right = array.length - 1;
		while(left >= 0) {
			if (array[left] != 0) {
				array[right] = array[left];
				right--;
			}
			
			left--;
			
		}
		
		while(right >= 0) {
			array[right] = 0;
			right--;
		}
		
		return array;
	}
	
	public static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
