package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		List<String> strList = Arrays.asList("b", "ab", "aa", "z");

		strList.stream().sorted((c1,c2)->c2.compareTo(c1)).forEach(System.out::print);

		//strList.stream().sorted().forEach(System.out::println);

		List<Employee> emp = Arrays.asList(new Employee(1, "raj", 400), new Employee(2, "lilly", 200),
				new Employee(3, "chris", 600), new Employee(1, "john", 100));
		
		
		//emp.stream().sorted((e1,e2)-> (int) (e2.getSal()-e1.getSal())).forEach(System.out::println);
		
		emp.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
		
		//System.out.println(emp);
	}
}
