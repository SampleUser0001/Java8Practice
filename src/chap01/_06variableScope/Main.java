package chap01._06variableScope;

public class Main {

	public static void main(String[] args){
		repeatMessage("hoge",10);

		new Methods().toStringByRunnable();
	}

	public static void repeatMessage(String text , int count){
		Runnable r = () -> {
			for(int i=0;i<count;i++){
				System.out.println(text);
			}
		};

		new Thread(r).start();

	}

	public static void setBean(Bean bean){
		Runnable r = () -> {
			bean.setValue(bean.getValue() + "hoge");
		};
	}

}
