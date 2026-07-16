package org.tnsif.acc.c2tc;

public class VariableDemo {
	int price=20;                             // instance
	
	void print() {
		String msg="hello";                    //local variable
		System.out.println(msg);
	}
	static String message ="Hello Students";    //static variable

	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo(); //object create
		System.out.println(obj.price);  //call instance 
		obj.print();                    //call local variable
		System.out.println(message);    //static variable

	}

}
