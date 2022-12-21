package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "a", "b", "c", "z");
		Set<String> set=new HashSet<>();
		
		list.stream().filter(f->!set.add(f)).forEach(System.out::print);
	}
}
