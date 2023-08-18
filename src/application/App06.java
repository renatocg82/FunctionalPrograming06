package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App06 {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(3, 4, 5, 10, 7);
		
		Stream<Integer> intStream = intList.stream();
		System.out.println(Arrays.toString(intStream.toArray()));
		System.out.println("-----------");
		
		Stream<Integer> intStream2 = intList.stream().map(x -> x*10);
		System.out.println(Arrays.toString(intStream2.toArray()));
		System.out.println("-----------");
		
		Stream<String> strStream = Stream.of("Isabel", "Renato", "Eduardo");
		System.out.println(Arrays.toString(strStream.toArray()));
		System.out.println("-----------");
		
		Stream<Integer> intStream3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(intStream3.limit(10).toArray()));
		System.out.println("-----------");
		
		Stream<Long> longStream = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1] , x[0] + x[1]}).map(x -> x[0]);
		System.out.println(Arrays.toString(longStream.limit(10).toArray()));
		System.out.println("-----------");
		
		
		Stream<Long> longStream2 = Stream.iterate(new Long[] {0L, 1L}, x -> new Long[] {x[1], x[0] + x[1]}).map(x -> x[0]);
		System.out.println(Arrays.toString(longStream2.limit(20).toArray()));		
	}
}
