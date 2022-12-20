package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOps {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,5,4,3,6);
	Integer min = list.stream().min((v1,v2)->v1.compareTo(v2)).get();
	System.out.println(min);
	
	Integer max = list.stream().max((v1,v2)->v1.compareTo(v2)).get();
	System.out.println(max);
	
	Long count = list.stream().count();
	System.out.println(count);
	
	List<Integer> collect = list.stream().collect(Collectors.toList());
	System.out.println(collect);
	
	List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
	System.out.println(collect2);
	
	list.stream().forEach(System.out::print);
}
}
