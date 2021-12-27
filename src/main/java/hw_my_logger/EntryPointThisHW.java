/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package hw_my_logger;

/**
 * Класс EntryPoint
 */
public class EntryPointThisHW {
	public static void main(String[] args) {
		MyInterface myInterface = UtileClass.createMyClass();
		myInterface.UsualMethod();
		myInterface.LoggedMethod("Кубик");
	}
}