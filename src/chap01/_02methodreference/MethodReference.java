package chap01._02methodreference;

/**
 * メソッド参照
 * @author Satoru
 *
 */
public class MethodReference {

	public static void main(String[] args) {
		Hoge hoge = (String s) -> {System.out.println(s);};
		Hoge hoge2 = (System.out::println);

		UseHoge useHoge = (s) -> System.out.println(s);
		UseHoge useHoge2 = (System.out::println);

		hoge.hoge("a");
		hoge.hoge("a");
		useHoge.useHoge(hoge);
	}

}
