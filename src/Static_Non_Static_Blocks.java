
public class Static_Non_Static_Blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi I am Main Method");
	}
	static {
		System.out.println("Hi I am Static Block I will be executed first");
	}
	static {
		System.out.println("Hi I am Static Block2 I will be executed second in sequence");
	}

}

//Output
//Hi I am Static Block I will be executed first
//Hi I am Static Block2 I will be executed second in sequence
//Hi I am Main Method
