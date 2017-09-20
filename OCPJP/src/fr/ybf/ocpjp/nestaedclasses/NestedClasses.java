package fr.ybf.ocpjp.nestaedclasses;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import fr.ybf.ocpjp.nestaedclasses.NestedClasses.Inner.InnerInner;

public class NestedClasses {

	private String hello = "Hello";
	
	protected class Inner{
		private void innerMethod() {
			for (int i = 0; i < 3; i++) {
				System.out.println(hello);
			}
		}
		
		public class InnerInner{
			void innerInnerMethod(){
				System.out.println("innerInnerMethod");
			}
		}
	}
	
	static class NestedStaticClass{
		private String nscVar = "this a nested static class";
	}
	
	public void callInnerMethod() {
		Inner inner = new Inner();
		inner.innerMethod();
	}
	
	public void testlocalInnerClass(String s){
		String hi = "Hi ";
		
		class LocalInnerClass{
			public void printHello(){
				System.out.println(hi + s);
			}
		}
		LocalInnerClass lic = new LocalInnerClass();
		lic.printHello();
	}
	
	
	public static void main(String[] args) {
		// Inner Classes tests
		NestedClasses.Inner  inner = new NestedClasses().new Inner();
		inner.innerMethod();
		InnerInner innerInner = inner.new InnerInner();
		innerInner.innerInnerMethod();
		new NestedClasses().callInnerMethod();
		
		// Local Inner Classes tests
		NestedClasses nc = new NestedClasses();
		nc.testlocalInnerClass("Youssef");
		
		
		// Static Nested Classes
		NestedStaticClass nsc = new NestedStaticClass();
		System.out.println(nsc.nscVar);
	}
}
