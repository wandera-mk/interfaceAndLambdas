package practice1;

import java.util.function.Consumer;

import dto.Employee;

public class Printer implements Consumer<Employee> {

	@Override
	public void accept(Employee e) {
		System.out.println(e.getName());
	}
}
