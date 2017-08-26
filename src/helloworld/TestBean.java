package helloworld;

public class TestBean {
	public void sayHi() {
		System.out.println("Hi, you!");
	}
	public void init() {
		System.out.println("bean init...");
	}

	public void destroy() {
		System.out.println("bean destroy...");
	}
}
