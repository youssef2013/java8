package fr.ybf.ocpjp.enumeration;

public enum OCPJP {

	EASY("1"), MEDIUM("2"), HARD("3"), VERYHARD("4");
//	String label;
	
	private OCPJP(String label) {
//		this.label = label;
	}
	
	public void printLabel(){
		System.out.println(this.ordinal());
	}
	}
