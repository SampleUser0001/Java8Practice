package chap01._01lambda;

public class RambdaMain {

	public static void main(String[] args){
		Runnable runner = () -> {
			System.out.println("Welcome to JDK1.8 !!");
		};

		runner.run();

	}
}
