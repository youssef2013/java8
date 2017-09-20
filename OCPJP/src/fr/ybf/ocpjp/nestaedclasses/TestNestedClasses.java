package fr.ybf.ocpjp.nestaedclasses;

import fr.ybf.ocpjp.nestaedclasses.NestedClasses.Inner;
import static fr.ybf.ocpjp.nestaedclasses.NestedClasses.NestedStaticClass;

public class TestNestedClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inner i = new NestedClasses().new Inner();
		 
		NestedStaticClass nestedStaticClass = new NestedStaticClass();
	}

}
