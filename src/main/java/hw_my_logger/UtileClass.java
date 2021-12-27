/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package hw_my_logger;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Класс UtileClass
 */
public class UtileClass {
	private UtileClass() {
	}

	static MyInterface createMyClass() {
		InvocationHandler handler = new DemoInvocationHandler(new InterfaceRealisation());
		return (MyInterface) Proxy.newProxyInstance(UtileClass.class.getClassLoader(),
			new Class<?>[]{MyInterface.class}, handler);
	}


	static class DemoInvocationHandler implements InvocationHandler {

		private final MyInterface myInterface;

		DemoInvocationHandler(MyInterface myInterface) {
			this.myInterface = myInterface;
		}

		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			System.out.println("Invoking method" + method);
			if(method.isAnnotationPresent(Log.class)) {
				System.out.println(Arrays.toString(args));
			}

			return method.invoke(myInterface, args);

		}
	}

}