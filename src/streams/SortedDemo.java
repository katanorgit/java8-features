package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo {
public static void main(String[] args) {
	List<Integer> list =Arrays.asList(1,2,3,4,5);
	
	List<String> strList=Arrays.asList("b","ab","aa","z");
	
	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::print);
	
	strList.stream().sorted().forEach(System.out::println);
}
}
