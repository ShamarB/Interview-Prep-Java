package Arrays;

public class GoogleInterview {

	public static void main(String[] args) {
		char[] disk = {'D', 'D', 'G', 'F', 'F', 'F', 'G', 'F', 'G', 'D', 'D'};
		printArray(disk);
		moveDisks(disk); System.out.println("-------------------");
		printArray(disk);
		

	}
	
	
	public static void moveDisks(char[] disks) {
		int i = 0;
		int j = 1;
		
		while (i < disks.length && j < disks.length) {
			if (disks[i] == 'D') {
				i++;
				j++;
			} else {
				if (disks[j] == 'D') {
					swap(disks, i, j);
					i++;
					j++;
				} else
					j++;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void rearrange(char[] disk) {
		int i = 0;
		int j = 1;
		while (i < size(disk) && j < size(disk)) {
			if (disk[i] == 'D') {
				i++;
				j++;
			} else {
				if (disk[j] == 'D') {
					swap(disk, i, j);
					i++;
					j++;
				} else {
					j++;
				}
			}
		}
	}
	
	public static void swap(char[] disk, int left, int right) {
		char temp = disk[left];
		disk[left] = disk[right];
		disk[right] = temp;
	}
	
	public static int size(char[] disk) {
		return disk.length;
	}
	
	public static char get(char[] disk, int num) {
		return disk[num];
	}
	
	public static void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
