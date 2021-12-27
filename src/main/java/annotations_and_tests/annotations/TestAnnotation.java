/*
 * Copyright (c) 2021 Tander, All Rights Reserved.
 */

package annotations_and_tests.annotations;

/**
 * Класс TestAnnotation
 */
public class TestAnnotation {
	@Before
	public void method1() {
		System.out.println("before is running");
	}

	@Test
	public void method2() {
		System.out.println("test1 is running");
	}

	@Test
	public void method4() {
		System.out.println("test2 is running");
	}

	@After
	public void method3() {
		System.out.println("after is running");
	}

}