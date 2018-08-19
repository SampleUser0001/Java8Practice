package chap01._06variableScope;

public class Methods {

	public void toStringByRunnable(){
		Runnable r = () -> {
			System.out.println("ラムダ式で記述");
			System.out.println(this.toString());
		};
		new Thread(r).start();

		Runnable r2 = new Runnable(){
			public void run() {
				System.out.println("匿名クラスで記述");
				System.out.println(this.toString());
			};
		};
		new Thread(r2).start();
	}

	@Override
	public String toString() {
		return "Methods.toString() called.";
	}


}
