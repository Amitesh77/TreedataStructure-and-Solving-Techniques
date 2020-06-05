package SortingAmitesh;

public class SelectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10, 3, 2, 5, 8, 4, 3, 1, 2, 9, 7, 8};
		
		Selection sort=new Selection();
		
		sort.selectionSort(array);
		
		sort.printArray(array);

	}

}
