package java0731;

import java.io.InputStream;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Ex1 {
	static int sum = 0 ;
	public static void main(String[] args) {
//		IntConsumer x = new IntConsumer() 
		
		
		IntStream.rangeClosed(1, 5).forEach(a->{
			sum +=a;
		});
			System.out.println(sum);

	}

}