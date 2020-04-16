package Sorting;

import java.util.LinkedList;
import java.util.Random;

public class SortingTest<E> implements Sorting<E> {

	// constructor
	public SortingTest() {

	}

	public static void main(String[] args) {
		String str = "";
		int n = 10;
		LinkedList<Integer> list = new LinkedList<Integer>();
		SortingTest sort = new SortingTest();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			list.add(random.nextInt());
		}
		System.out.print(str += list);
		sort.insertionSort(list, 0, 0, false);
		System.out.println("" + list);
		System.out.println("end");

	}

	@Override
	public void insertionSort(LinkedList<E> list, int lowindex, int highindex, boolean reversed) {
		for (int nextPos = 1; nextPos < list.size(); nextPos++) {
			int temp = nextPos;
			Comparable nextVal = (Comparable) list.get(nextPos);
			while (temp > 0 && nextVal.compareTo(list.get(nextPos - 1)) < 0) {
				list.remove(temp);
				list.add(temp - 1, (E) nextVal);
				temp--;
			}
			list.add(temp, (E) nextVal);
		}
	}

	@Override
	public void quicksort(LinkedList<E> list, int lowindex, int highindex, boolean reversed) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mergeSortLL(LinkedList<E> list, boolean reversed) {
		// TODO Auto-generated method stub

	}

}
