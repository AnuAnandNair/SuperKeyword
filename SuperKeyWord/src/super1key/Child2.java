package super1key;

public class Child2 extends Parent2 {
	int a=70;
	
	public Child2(){
		System.out.println("Child Class Constructor");
	}
	public void display() {
		super.display();
		System.out.println("In parent from child class display");
	}
	
	public void childDisplay() {
		System.out.println(a);
		System.out.println(super.a);
		System.out.println("In child class display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 c=new Child2();
		c.display();
		c.childDisplay();
		System.out.println(c.a);
		
	}

}