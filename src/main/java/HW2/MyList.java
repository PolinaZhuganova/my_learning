package HW2;

import java.util.Comparator;

/**
 * Класс MyList
 */
public interface MyList<E> {
	 void add(E element);
	 void remove(int index);
	 void removeByElement(E element);
	 int size();
	 E get(int index);
	 void sort(Comparator<? super E> c);
	 void copy(MyList <E>myList );
}