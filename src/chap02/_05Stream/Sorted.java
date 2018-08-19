package chap02._05Stream;

import java.util.Comparator;

public class Sorted {

	public static void main(String[] args) {
		System.out.println("----- sorted -----");
		Util.stream.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);;
	}
}
