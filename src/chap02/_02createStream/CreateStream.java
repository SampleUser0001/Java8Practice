package chap02._02createStream;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {


	public static void main(String[] args) throws IOException{
		Path input = Paths.get(System.getProperty("user.dir"),"files","code","ch2","sec01","war-and-peace.txt");
		List<String> list = Files.readAllLines(input);

		Stream<String> echos = Stream.generate(() -> "Echo");
		// echos.forEach(System.out::println);
		Stream<Double> randoms = Stream.generate(Math::random);
		// randoms.forEach(System.out::println);

		Stream<BigInteger> integers = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE));
		integers.forEach(System.out::println);
	}
}
