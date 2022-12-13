package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MethodReference {
	private static Stream<String> stream;

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("AWS Coud");
		list.add("AWS Developer");
		list.add("AWS Architech");
		list.add("AWS Devops");
		list.add("MS devloper cloud");
		list.add("MS Devops");

		stream = list.stream();
		stream.filter(str -> str.startsWith("AWS")).forEach(System.out::println);
	}
}
