package Sorting;

import java.util.LinkedList;

public interface Sorting<E> {
	public void insertionSort(LinkedList<E> list, boolean reversed);

	public void quicksort(LinkedList<E> list, boolean reversed);

	public void mergeSortLL(LinkedList<E> list, boolean reversed);
}
