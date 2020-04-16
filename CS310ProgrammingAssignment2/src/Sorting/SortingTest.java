package Sorting;

import java.util.LinkedList;
import java.util.Random;

public class SortingTest<E> implements Sorting<E> {

	// constructor
	public SortingTest() {

	}

	public static void main(String[] args) {
		String str = "";
		int n = 1500;
		SortingTest sort = new SortingTest();
		LinkedList<Integer> list = new LinkedList<Integer>();
		Random random = new Random();
		for (int i = 0; i < n; i++) {
			list.add(random.nextInt(100));
		}
		System.out.println(str += list);
		long timeBefore = System.currentTimeMillis();
		sort.insertionSort(list, false);
		long timeAfter = System.currentTimeMillis();
		long totalTime = timeAfter - timeBefore;
		System.out.println("" + list);
		System.out.println("Total time: " + totalTime * 1000000 + " ns ");

	}

	@Override
	public void insertionSort(LinkedList<E> list, boolean reversed) {
		int nextPos, temp = 0;
		Comparable nextVal = null;
		if (reversed == false) {
			for (nextPos = 1; nextPos < list.size(); nextPos++) {
				temp = nextPos;
				nextVal = (Comparable) list.get(temp);
				while (temp > 0 && nextVal.compareTo(list.get(temp - 1)) < 0) {
					list.remove(temp);
					list.add(temp - 1, (E) nextVal);
					temp--;
				}
			}
		} else {
			for (nextPos = 1; nextPos < list.size(); nextPos++) {
				temp = nextPos;
				nextVal = (Comparable) list.get(temp);
				while (temp > 0 && nextVal.compareTo(list.get(temp - 1)) > 0) {
					list.remove(temp);
					list.add(temp - 1, (E) nextVal);
					temp--;
				}
			}
		}
	}

	@Override
	public void quicksort(LinkedList<E> list, boolean reversed) {
		if(reversed == false) {
			LinkedList n = list;
			quickSort(list, 0, list.size() - 1);
		} else {
	}

	private void quickSort(LinkedList<E> list, int left, int right) {
		if (right - left <= 0)
			return;
		Comparable pivot = (Comparable) list.get(right);
		int partition = getPartition(list, left, right, pivot);
		quickSort(list, left, partition - 1);
		quickSort(list, partition + 1, right);
	}

	private int getPartition(LinkedList<E> list, int left, int right, Comparable pivot) {
		int lPtr = left - 1;
		int rPtr = right;
		for (;;) {
			while (((Comparable) list.get(++lPtr)).compareTo(pivot) < 0)
				;
			while (rPtr > 0 && ((Comparable) list.get(--rPtr)).compareTo(pivot) < 0)
				;
			if (lPtr >= rPtr)
				break;
			else
				swap(list, lPtr, rPtr);
		}
		swap(list, lPtr, right);
		return lPtr;
	}

	private void swap(LinkedList list, int one, int two) {
		Object temp = list.get(one);
		list.remove(one);
		list.add(temp);
		Object tempTwo = list.get(two);
		list.remove(two);
		list.add(tempTwo);
	}

	@Override
	public void mergeSortLL(LinkedList<E> list, boolean reversed) {
		LinkedList n = list;
		LinkedList<E> aux = new LinkedList<E>();
		mergeSortHelper(n, aux, 0, n.size() - 1);
	}

	private void mergeSortHelper(LinkedList<E> n, LinkedList<E> aux, int low, int hi) {
		if (low == hi)
			return;
		int mid = (low + hi) >> 1;
		mergeSortHelper(n, aux, low, mid);
		mergeSortHelper(n, aux, mid + 1, hi);
		merge(n, aux, low, mid + 1, hi);
	}

	private void merge(LinkedList<E> n, LinkedList<E> aux, int low, int hi, int upperBound) {
		int j = 0;
		int lowerBound = low;
		int mid = hi - 1;
		int numElements = upperBound - lowerBound + 1; // number of items

		while (low <= mid && hi <= upperBound)
			if ((n.get(low)).compareTo(n.get(hi)))
				aux.get(j++) = n.get(low++);
			else
				aux.get(j++) = n.get(hi++);
		while (low <= mid)
			aux.get(j++) = n.get(low++);
		while (hi <= upperBound)
			aux.get(j++) = n.get(hi++);
		for (j = 0; j < numElements; j++) {
			n.get(lowerBound) = aux.get(j);
		}
	}

}
