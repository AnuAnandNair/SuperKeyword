package superkey;

public class ChildClass extends ParentClass{
	
	int a=70;
	
	public ChildClass() {//child class constructor
		System.out.println("In child class constructor");
	}
	
	public void display() {//Since child and parent both have same method name, child class display will be invoked.
		super.display();		
		System.out.println("In child class display");
		//super.display();//can be given anywhere in the display function
	}
	
	public void show() {
		System.out.println("In child class show method");
		System.out.println("The value of a in child class is "+a);//Here, a will work as both variable a and show function are instance
		System.out.println("The value of a from parent class is "+super.a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass();//first parent class constructor gets invoked and later child class constructor gets invoked during object creation
		c.display();
		c.show();
		System.out.println(c.a);//prints child class instance variable. Since main is static, call it using object.variable name
		//System.out.println(super.a);//can't use super keyword in static method. So, use it in some other method
	}

}
