package Sorting;

import java.util.LinkedList;
import java.util.Random;

public class SortingTest<E> implements Sorting<E> {

	LinkedList<E> list;

	// constructor
	public SortingTest() {
		LinkedList<E> list = new LinkedList<E>();
	}

	public static void main(String[] args) {
		SortingTest sort = new SortingTest();
		sort.list;
		Random random = new Random();
		// Insertion Sort; Sorted from Unsorted and Sorted (Not Reverse)
		printTime(sort, list, random, "Insertion Sort", 10, false);
		printTime(sort, list, random, "Insertion Sort", 50, false);
		printTime(sort, list, random, "Insertion Sort", 100, false);
		printTime(sort, list, random, "Insertion Sort", 150, false);
		printTime(sort, list, random, "Insertion Sort", 300, false);
		printTime(sort, list, random, "Insertion Sort", 500, false);
		printTime(sort, list, random, "Insertion Sort", 1000, false);
		printTime(sort, list, random, "Insertion Sort", 1500, false);

		// Insertion Sort; Sorted from Reverse
		printTime(sort, list, random, "Insertion Sort", 10, true);
		printTime(sort, list, random, "Insertion Sort", 50, true);
		printTime(sort, list, random, "Insertion Sort", 100, true);
		printTime(sort, list, random, "Insertion Sort", 150, true);
		printTime(sort, list, random, "Insertion Sort", 300, true);
		printTime(sort, list, random, "Insertion Sort", 500, true);
		printTime(sort, list, random, "Insertion Sort", 1000, true);
		printTime(sort, list, random, "Insertion Sort", 1500, true);

		// Quick Sort; Sorted from Unsorted and Sorted (Not Reverse)
		printTime(sort, list, random, "Quick Sort", 10, false);
		printTime(sort, list, random, "Quick Sort", 50, false);
		printTime(sort, list, random, "Quick Sort", 100, false);
		printTime(sort, list, random, "Quick Sort", 150, false);
		printTime(sort, list, random, "Quick Sort", 300, false);
		printTime(sort, list, random, "Quick Sort", 500, false);
		printTime(sort, list, random, "Quick Sort", 1000, false);
		printTime(sort, list, random, "Quick Sort", 1500, false);

		// Quick Sort; Sorted from Reverse
		printTime(sort, list, random, "Quick Sort", 10, true);
		printTime(sort, list, random, "Quick Sort", 50, true);
		printTime(sort, list, random, "Quick Sort", 100, true);
		printTime(sort, list, random, "Quick Sort", 150, true);
		printTime(sort, list, random, "Quick Sort", 300, true);
		printTime(sort, list, random, "Quick Sort", 500, true);
		printTime(sort, list, random, "Quick Sort", 1000, true);
		printTime(sort, list, random, "Quick Sort", 1500, true);

		// Merge Sort; Sorted from Unsorted and Sorted (Not Reverse)
		printTime(sort, list, random, "Merge Sort", 10, false);
		printTime(sort, list, random, "Merge Sort", 50, false);
		printTime(sort, list, random, "Merge Sort", 100, false);
		printTime(sort, list, random, "Merge Sort", 150, false);
		printTime(sort, list, random, "Merge Sort", 300, false);
		printTime(sort, list, random, "Merge Sort", 500, false);
		printTime(sort, list, random, "Merge Sort", 1000, false);
		printTime(sort, list, random, "Merge Sort", 1500, false);

		// Merge Sort; Sorted from Reverse
		printTime(sort, list, random, "Merge Sort", 10, true);
		printTime(sort, list, random, "Merge Sort", 50, true);
		printTime(sort, list, random, "Merge Sort", 100, true);
		printTime(sort, list, random, "Merge Sort", 150, true);
		printTime(sort, list, random, "Merge Sort", 300, true);
		printTime(sort, list, random, "Merge Sort", 500, true);
		printTime(sort, list, random, "Merge Sort", 1000, true);
		printTime(sort, list, random, "Merge Sort", 1500, true);
	}

	public void printTime(SortingTest sort, LinkedList list, Random random, String str, int input, boolean reversed) {
		if (str == "Insertion Sort" && reversed == false) {
			for (int i = 0; i < input; i++) {
				list.add(random.nextInt(), null);
			}
			long timeBeforeInsertionUnsorted = System.currentTimeMillis();
			sort.insertionSort(list, false);
			long timeAfterInsertionUnsorted = System.currentTimeMillis();
			long totalTimeInsertionUnsorted = timeAfterInsertionUnsorted - timeBeforeInsertionUnsorted;
			System.out.println("Time for unsorted list (Insertion): " + totalTimeInsertionUnsorted * 1000000 + " ns ");

			long timeBeforeInsertionSorted = System.currentTimeMillis();
			sort.insertionSort(list, false);
			long timeAfterInsertionSorted = System.currentTimeMillis();
			long totalTimeInsertionSorted = timeAfterInsertionSorted - timeBeforeInsertionSorted;
			System.out.println("Time for sorted list (Insertion): " + totalTimeInsertionSorted * 1000000 + " ns ");
		} else if (str == "Insertion Sort" && reversed == true) {
			for (int i = 0; i < input; i++) {
				list.add(random.nextInt(100), null);
			}
			long timeBeforeInsertionReverse = System.currentTimeMillis();
			sort.insertionSort(list, true);
			long timeAfterInsertionReverse = System.currentTimeMillis();
			long totalTimeInsertionReverse = timeAfterInsertionReverse - timeBeforeInsertionReverse;
			System.out.println(
					"Time for reverse sorted list (Insertion): " + totalTimeInsertionReverse * 1000000 + " ns ");
		} else if (str == "Quick Sort" && reversed == false) {
			for (int i = 0; i < input; i++) {
				list.add(random.nextInt(), null);
			}
			long timeBeforeQuickUnsorted = System.currentTimeMillis();
			sort.quicksort(list, false);
			long timeAfterQuickUnsorted = System.currentTimeMillis();
			long totalTimeQuickUnsorted = timeAfterQuickUnsorted - timeBeforeQuickUnsorted;
			System.out.println("Time for unsorted list (Quick Sort): " + totalTimeQuickUnsorted * 1000000 + " ns ");

			long timeBeforeQuickSorted = System.currentTimeMillis();
			sort.quicksort(list, false);
			long timeAfterQuickSorted = System.currentTimeMillis();
			long totalTimeQuickSorted = timeAfterQuickSorted - timeBeforeQuickSorted;
			System.out.println("Time for sorted list (Quick Sort): " + totalTimeQuickSorted * 1000000 + " ns ");
		} else if (str == "Quick Sort" && reversed == true) {
			for (int i = 0; i < input; i++) {
				list.add(random.nextInt(), null);
			}
			long timeBeforeQuickReverse = System.currentTimeMillis();
			sort.quicksort(list, true);
			long timeAfterQuickReverse = System.currentTimeMillis();
			long totalTimeQuickReverse = timeAfterQuickReverse - timeBeforeQuickReverse;
			System.out
					.println("Time for reverse sorted list (Quick Sort): " + totalTimeQuickReverse * 1000000 + " ns ");
		} else if (str == "Merge Sort" && reversed == false) {
			for (int i = 0; i < input; i++) {
				list.add(random.nextInt(), null);
			}
			long timeBeforeMergeUnsorted = System.currentTimeMillis();
			sort.mergeSortLL(list, false);
			long timeAfterMergeUnsorted = System.currentTimeMillis();
			long totalTimeMergeUnsorted = timeAfterMergeUnsorted - timeBeforeMergeUnsorted;
			System.out.println("Time for unsorted list (Merge Sort): " + totalTimeMergeUnsorted * 1000000 + " ns ");

			long timeBeforeMergeSorted = System.currentTimeMillis();
			sort.quicksort(list, false);
			long timeAfterMergeSorted = System.currentTimeMillis();
			long totalTimeMergeSorted = timeAfterMergeSorted - timeBeforeMergeSorted;
			System.out.println("Time for sorted list (Merge Sort): " + totalTimeMergeSorted * 1000000 + " ns ");
		} else if (str == "Merge Sort" && reversed == true) {
			for (int i = 0; i < input; i++) {
				list.add(random.nextInt(), null);
			}
			long timeBeforeMergeReverse = System.currentTimeMillis();
			sort.mergeSortLL(list, true);
			long timeAfterMergeReverse = System.currentTimeMillis();
			long totalTimeMergeReverse = timeAfterMergeReverse - timeBeforeMergeReverse;
			System.out.println("Time for unsorted list (Merge Sort): " + totalTimeMergeReverse * 1000000 + " ns ");
		}
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
		LinkedList n = list;
		quickSort(list, 0, list.size() - 1, reversed);
	}

	private void quickSort(LinkedList<E> list, int left, int right, boolean reversed) {
		if (right - left <= 0)
			return;
		Comparable pivot = (Comparable) list.get(right);
		int partition = getPartition(list, left, right, pivot, reversed);
		quickSort(list, left, partition - 1, reversed);
		quickSort(list, partition + 1, right, reversed);
	}

	private int getPartition(LinkedList<E> list, int left, int right, Comparable pivot, boolean reversed) {
		int lPtr = left - 1;
		int rPtr = right;
		for (;;) {
			if (reversed == false) {
				while (((Comparable) list.get(++lPtr)).compareTo(pivot) > 0)
					;
			} else {
				while (((Comparable) list.get(++lPtr)).compareTo(pivot) < 0)
					;
			}
			while (rPtr > 0 && ((Comparable) list.get(--rPtr)).compareTo(pivot) > 0)
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
		E temp = (E) list.get(one);
		list.set(one, list.get(two));
		list.set(two, (E) temp);
	}

	@Override
	public void mergeSortLL(LinkedList<E> list, boolean reversed) {
		LinkedList n = list;
		LinkedList<E> aux = new LinkedList<E>();
		mergeSortHelper(n, aux, 0, n.size() - 1, reversed);
	}

	private void mergeSortHelper(LinkedList<E> n, LinkedList<E> aux, int low, int hi, boolean reversed) {
		if (low == hi)
			return;
		int mid = (low + hi) >> 1;
		mergeSortHelper(n, aux, low, mid, reversed);
		mergeSortHelper(n, aux, mid + 1, hi, reversed);
		merge(n, aux, low, mid + 1, hi, reversed);
	}

	private void merge(LinkedList<E> n, LinkedList<E> aux, int low, int hi, int upperBound, boolean reversed) {
		int j = 0;
		int lowerBound = low;
		int mid = hi - 1;
		int numElements = upperBound - lowerBound + 1; // number of items

		while (low <= mid && hi <= upperBound) {
			if (reversed == false) {
				if (((Comparable) n.get(low)).compareTo(n.get(hi)) > 0)
					aux.set(j++, n.get(low++));
				else
					aux.set(j++, n.get(hi++));
			} else {
				if (((Comparable) n.get(low)).compareTo(n.get(hi)) < 0)
					aux.set(j++, n.get(low++));
				else
					aux.set(j++, n.get(hi++));
			}
		}
		while (low <= mid)
			aux.set(j++, n.get(low++));
		while (hi <= upperBound)
			aux.set(j++, n.get(hi++));
		for (j = 0; j < numElements; j++) {
			n.set(lowerBound, aux.get(j));
		}
	}

}
