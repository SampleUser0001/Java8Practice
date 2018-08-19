package chap02._05Stream;


public class Distinct {


	public static void main(String[] args){
		System.out.println("----- distinct -----");
		Util.stream.distinct().forEach(System.out::println);
	}
}
