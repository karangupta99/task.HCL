package seleniumDemo;
// today we learn here  inheritence polymorphism packages and interfaces 



class animal{
	String name ;
	
	public animal() {
		System.out.println("Animal is eating ");
	}
	
	void eat(String n) {
		System.out.println("is eating ");
		
	}
	void eat() {
		System.out.println("halu  eating ");
	}
}

class Dog extends animal{
	
	
	 Dog() {
		super();
		 
	}
	
	
	void eat(){
		System.out.println("Dog is eating ");
		super.eat();
		 System.out.println(super.name = "Karan");
	}
	
}

class Cat extends Dog{
	
	
	void eat(){
		System.out.println("Cat is eating ");
	}
	
}



public class Day5 {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
	}

}


