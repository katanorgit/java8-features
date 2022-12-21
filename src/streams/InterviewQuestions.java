package streams;

import java.util.function.Consumer;

public class InterviewQuestions {
	public static void main(String[] args) {
		// default methods
		// static methods
		// -- Predicate - boolean();
		// predicate<T> joining - > by And , Or
		// Function<T,R> - apply(T);
		// Functional Chaining - > using andThen();
		// consumer<T> -> accept (T)
		// consumer chaining -> using andThen();

		// supplier<R> -- > no chaining is not possible in supplier , because it will
		// not take any input.

		// above will take single input and product single output. What if we need to
		// pass multiple arguments instead of one. Then comes BiFucntion..Bi etc
		// There is no way in java 8 where we pass 3 arguments or quad (4) arguments .
		// Only 1 and 2 arguments is valid.

		// streams
		// --non termainal ops
		// filter
		// map
		// distinct
		// limit
		// skip
		// peek

		/// termainal ops
		// count
		// min
		// max
		// collect
		// foreach
		// reduce

		// sorted
		// parellal streams (improve performance)

		Consumer<Integer> consumer1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t * t);
			}
		};

		Consumer<Integer> consumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(t * 5);
			}
		};

		consumer1.andThen(consumer2).accept(2);

	}
}
