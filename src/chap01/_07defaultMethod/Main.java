package chap01._07defaultMethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<String> LIST = new ArrayList<String>();
	static{
		LIST.add("hoge");
		LIST.add("piyo");
		LIST.add("fuga");
	}

	public static void main(String[] args) {
		// 旧
		for(String s : LIST){
			System.out.println(s);
		}
		System.out.println();

		// 新
		LIST.forEach(System.out::println);
	}
}
