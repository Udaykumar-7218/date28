class AddDemo{
	void Add(int a, int b) {
		System.out.println("a+b..."+(a+b));
	}
	void Add(int a ,int b,int c) {
		System.out.println("a+b+c..."+(a+b+c));
	}
	void Add(String firstName,String lastname) {
		System.out.println("full name...>"+firstName+""+lastname);
	}
}
public class OverloadDemo {

	public static void main(String[] args) {
		AddDemo addDemo=new AddDemo();
		addDemo.Add(10,20);
		addDemo.Add("uday", "kumar");
		addDemo.Add(10, 20, 30);
	}
	

	}

