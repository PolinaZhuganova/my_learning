/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package hw_my_logger;

/**
 * Класс LogAnnotatedMethods
 */
public class InterfaceRealisation implements MyInterface{
	@Log
	@Override
	public void LoggedMethod(String string) {
		System.out.println(string);
	}

	@Override
	public void UsualMethod() {

	}


}