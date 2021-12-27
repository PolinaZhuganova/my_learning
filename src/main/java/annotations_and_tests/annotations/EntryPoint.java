/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package annotations_and_tests.annotations;

/**
 * Класс EntryPoint
 */
public class EntryPoint {
	public static void main(String[] args) {
		try {
			Launcher launcher = new Launcher();
			launcher.start(TestAnnotation.class.getName());
		} catch (ClassNotFoundException e) {
			System.out.println("класс не найден");
		}




	}

}