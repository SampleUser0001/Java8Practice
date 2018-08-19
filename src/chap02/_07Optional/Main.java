package chap02._07Optional;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * とりあえず使ってみる
 * ifPersent と mapの違いを探る
 * @author Satoru
 *
 */
public class Main {

	public static void main(String[] args) throws IOException{
		Path input = Paths.get(System.getProperty("user.dir"),"files","code","ch2","alice.txt");

		String contents = new String( Files.readAllBytes(input));
		List<String> words = (List) Arrays.asList(contents.split("\\P{L}+"));
		Optional<String> largest = words.stream().max(null);

// 		Stream<String> ifPresentUse = .stream();
// 		Optional<String> largest = ;

		Stream<String> mapUse = Files.lines(input);



	}
}
