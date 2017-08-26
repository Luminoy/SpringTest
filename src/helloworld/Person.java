package helloworld;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name1, int age1) {
		this.name = name1;
		this.age = age1;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void strong() {
		System.out.println("method body...");
	}
	
	public void printInfo() {
		System.out.println("name:" + getName() + ", age:" + getAge());
	}
}
