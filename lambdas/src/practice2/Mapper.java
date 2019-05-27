package practice2;

import java.util.function.Function;

import dto.Employee;

public class Mapper implements Function<Employee, String> {

	@Override
	public String apply(Employee e) {
		return e.getName()	+ " likes sport!";
	}
}
