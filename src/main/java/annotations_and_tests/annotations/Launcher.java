/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package annotations_and_tests.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

/**
 * Класс Launcher
 */
public class Launcher {


	public void start(String className) throws ClassNotFoundException {

		Class clazz = Class.forName(className);

		Method annotatedMethod[] = clazz.getDeclaredMethods();
		System.out.println("class methods:");
		for (var met : annotatedMethod
		) {
			System.out.println(met.getName());
		}

		System.out.println("given annotations:");


		ArrayList<Method> beforeArr = new ArrayList<>();
		ArrayList<Method> test = new ArrayList<>();
		ArrayList<Method> after = new ArrayList<>();

		for (var method : annotatedMethod) {
			for (var annotation : method.getDeclaredAnnotations()) {
				System.out.println(annotation.annotationType().getSimpleName());
				String annName = annotation.annotationType().getSimpleName();
				if (annName.equals("Before")) {
					beforeArr.add(method);
				} else if (annName.equals("Test")) {
					test.add(method);
				} else if (annName.equals("After")) {
					after.add(method);
				}
			}
		}

		try {
			Object forTest = clazz.getConstructor().newInstance();
			for (int a = 0; a < test.size(); a++) {
				for (var bfr : beforeArr) {
					bfr.invoke(forTest);
				}
			test.get(a).invoke(forTest);

				for (var aft : after) {
					aft.invoke(forTest);
				}

			}
			} catch(InstantiationException e){
				e.printStackTrace();
			} catch(IllegalAccessException e){
				e.printStackTrace();
			} catch(InvocationTargetException e){
				e.printStackTrace();
			} catch(NoSuchMethodException e){
				e.printStackTrace();
			}


		}


	}




