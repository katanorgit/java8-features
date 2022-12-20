package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	Optional<Integer> reduce = list.stream().reduce((v,a)->{
		return a+v;
	});
	System.out.println(reduce.get());
}
}
