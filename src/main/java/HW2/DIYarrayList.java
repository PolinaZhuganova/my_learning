/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package HW2;

import java.sql.Array;
import java.util.*;

/**
 * Класс DIYarrayList
 */
public class DIYarrayList<E> implements MyList<E> {
	private int CAPACITY = 10;
	private Object array[];
	private int cellAmount = 0;
	private int size = 0;


	public DIYarrayList() {
		array = new Object[CAPACITY];
		cellAmount = CAPACITY;
	}

	public DIYarrayList(int initCapacity) {

		if (initCapacity == 0) {
			array = new Object[CAPACITY];
			cellAmount = CAPACITY;
		} else if (initCapacity < 0) {
			throw new IllegalArgumentException("Illegal Capacity: " +
				initCapacity);
		} else {
			array = new Object[initCapacity];
			cellAmount = initCapacity;
		}
	}


	@Override
	public void add(E element) {

		if (size == cellAmount) {
			cellAmount = cellAmount * 2;
			array = Arrays.copyOf(array, cellAmount);
			array[size] = element;
			size++;
		} else {
			array[size] = element;
			size++;
		}

	}


	@Override
	public void remove(int index) {

		if (index < array.length && index > 0) {
			cellAmount--;
			size--;
			Object arrayCopy[] = new Object[cellAmount - 1];
			System.arraycopy(array, 0, arrayCopy, 0, index);
			System.arraycopy(array, index + 1, arrayCopy, index, cellAmount - index);
			array = arrayCopy;
		}
	}

	@Override
	public void removeByElement(E element) {
		for (int a = 0; a < array.length; a++) {
			if (element.equals(array[a])) {
				cellAmount--;
				size--;
				Object arrayCopy[] = new Object[cellAmount - 1];
				System.arraycopy(array, 0, arrayCopy, 0, a);
				System.arraycopy(array, a + 1, arrayCopy, a, cellAmount - a);
				array = arrayCopy;
			}

		}


	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public E get(int index) {

		return (E) array[index];
	}

	@Override
	public void sort(Comparator<? super E> c) {
    Arrays.sort((E[]) array, 0, size, c);

	}

	@Override
	public void copy(MyList<E> myList) {

      Arrays.copyOf(array, cellAmount);

	}
}