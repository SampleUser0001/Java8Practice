package chap01._07defaultMethod.sample;

/**
 * http://d.hatena.ne.jp/nowokay/20130610
 * @author Satoru
 *
 */
public interface Foo {

	void print(String s);
	default void twice(String s){
		print(s);
		print(s);
	}
}
