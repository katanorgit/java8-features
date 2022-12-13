package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConsumerInStream {
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
		stream.filter(new Predicate<String>() {

			@Override
			public boolean test(String str) {
				// TODO Auto-generated method stub
				if (str.startsWith("MS")) {
					return true;
				}
				return false;
			}
		}).forEach(new Consumer<String>() {

					@Override
					public void accept(String t) {
						// TODO Auto-generated method stub
						System.out.println(t);
					}
				});
	}
}
