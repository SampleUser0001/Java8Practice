package chap01._05constractorreference;

public class SampleBeanExt extends SampleBean {

	public SampleBeanExt(String param1,String param2) {
		this.setVal1(param1);
		this.setVal2(param2);
		System.out.println("SampleBeanExtのコンストラクタが呼ばれました。");
	}
}
