package helloworld;

import java.util.Map.Entry;
import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTestMain {
	// 获取应用的上下文对象，可理解为“管家”
	private static AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

	public static void aspectTest() {
		System.out.println("切面测试：");
		// 通过上下文对象获取bean（反射机制）
		Person person = context.getBean("person1", Person.class);
		// 执行获取对象的一些方法
		person.strong();
	}
	
	public static void setterAware() {
		System.out.println("setter 注入：");
		Person person = context.getBean("person1", Person.class);
		person.printInfo();
	}

	public static void constructorAware() {
		System.out.println("构造器  注入：");
		Person person2 = context.getBean("person2", Person.class);
		person2.printInfo();
	}

	public static void testBeanAware() {
		System.out.println("bean的注入：");
		Dept dept = context.getBean("dept1", Dept.class);
		dept.printDept();
	}

	public static void testBeanInitDestroyMethod() {
		System.out.println("测试Bean的init-method和destroy-method：");
		TestBean tb = context.getBean("test1", TestBean.class);
		tb.sayHi();
		// 容器通过关闭钩子显式销毁singleton的Bean
		context.registerShutdownHook();
	}

	public static void testBeanCollectionAware() {
		System.out.println("Bean的集合测试：");
		Dept dept = context.getBean("dept2", Dept.class);
		dept.printDept();
		System.out.println("list集合:");
		for(Person pp: dept.getListEmps()) {
			pp.printInfo();
		}
		System.out.println("set集合:");
		for(Person pp: dept.getSetEmps()) {
			pp.printInfo();
		}
		System.out.println("map集合:");
		for(Entry entry: dept.getMapEmps().entrySet()) {
			System.out.println(entry.getKey());
			Person pp = (Person) entry.getValue();pp.printInfo();
		}
		System.out.println("Properties:");
		for(Entry entry: dept.getProps().entrySet()) {
			System.out.println(entry.getKey() + "--" + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		// aspectTest();
		// setterAware();
		// constructorAware();
		// testBeanAware();
		// testBeanInitDestroyMethod();
		 testBeanCollectionAware();
	}
}