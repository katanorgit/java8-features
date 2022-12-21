package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountDuplicateWords {
	public static void main(String[] args) {
		String str = "hi hi welcome to to java java";

		List<String> list = Arrays.asList(str.split(" "));
		Map<String, Long> map = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Set<Entry<String, Long>> entrySet = map.entrySet();

		entrySet.stream().filter(f -> f.getValue() > 1).map(m -> m.getKey()).forEach(System.out::println);

		
	}
}
