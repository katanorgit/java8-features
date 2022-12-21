package streams;

import java.util.stream.IntStream;

public class ParallelStreamDemo {
public static void main(String[] args) {
	/*
	long start = System.currentTimeMillis();
	IntStream.range(1, 9900000).forEach(System.out::println);
	long end = System.currentTimeMillis();
	System.out.println("sequencial");
	System.out.println(end-start);
	*/
	
	long start1 = System.currentTimeMillis();
	IntStream.range(1, 9900000).parallel().forEach(System.out::println);
	long end1 = System.currentTimeMillis();
	System.out.println("parallel");
	System.out.println(end1-start1);
}
}
