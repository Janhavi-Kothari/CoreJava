
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I will be before main");
		StaticMethod.method1();//call it using class name because static belongs to class
		method1();//call it using method name as it belongs to class
		System.out.println("I will be after main");

	}
	static void method1() {
		System.out.println("I am in Static Method");
	}
	static {
		System.out.println("I am in Static Block");
		StaticMethod.method1();
	}
	

}

//Output
//I am in Static Block
//I am in Static Method
//I will be before main
//I am in Static Method
//I am in Static Method
//I will be after main

