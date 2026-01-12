package seleniumDemo;


interface A{
	void show();
}

interface E{
	void display();
}

class B implements A, E{
	public void display() {
		System.out.println("Hello");
}
	public void show() {
		System.out.println("Hello");
	}
}

class s{
	void display(){
		System.out.println("Hello");
	}

		
}
class o extends s{
	void display() {
		System.out.println("Hanji");
	}
}

public class Interfaces {
public static void main(String[] args) {
	A b = new B();
	E b1 = new B();
	b.show();
	b1.display();
	o s1 = new o();
	s1.display();
	
}
}


packages is a collection of classes , interfaces,
