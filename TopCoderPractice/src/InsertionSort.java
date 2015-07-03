
public class InsertionSort {

	public static void insertionSort(int[] array) {
		int key, i;
		for (int j = 1; j < array.length; j++) {
			key = array[j];
			i = j-1;
			while(i >= 0 && array[i] > key) {
				array[i+1] = array[i];
				i = i-1;
			}
			array[i+1] = key;
		}
		
	}
	public static void main(String[] args) {
        
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
        insertionSort(input);
        printNumbers(input);
    }
     
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
    }
}
