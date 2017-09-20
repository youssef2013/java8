package fr.ybf.ocpjp.child;

import fr.ybf.ocpjp.parent.Parent;

public class Child extends Parent{

	protected int age;
	public static void main(String[] args) {
		Parent p = new Parent();
		Parent pc = new Child();
		Child c = new Child();
		
		System.out.println(c.nameAtHome());
	}
}
