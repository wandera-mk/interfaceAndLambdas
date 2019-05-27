package main;

import java.util.List;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		List<String> list = new Stack<String>();

		PracticeInterface hello = new PracticeClass() {
			@Override
			public void print() {
				System.out.println("I amprinting this from function");
			}
		};

		PracticeInterface clazz = new PracticeClass();

		PracticeInterface lambda = () -> System.out.println("I print this shit");


		clazz.print();
		hello.print();

		list.add("Hello ");
		list.add("World");

		printer(list);
	}

	private static void printer(List<String> list) {
		List<String> first = list;
	}

}
