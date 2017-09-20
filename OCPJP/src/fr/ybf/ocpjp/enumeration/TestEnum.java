package fr.ybf.ocpjp.enumeration;

public class TestEnum {

	public static void main(String[] args) {
		OCPJP o = OCPJP.MEDIUM;
		System.out.println(OCPJP.MEDIUM.ordinal());
		System.out.println(OCPJP.valueOf("HARD"));
		
		OCPJP.MEDIUM.printLabel();
		OCPJP.EASY.printLabel();
		OCPJP.VERYHARD.printLabel();
		OCPJP.HARD.printLabel();
		
		switch (o) {
		case EASY:
			System.out.println("i'ts easy");
			break;

		default:
			System.out.println("it's not easy");
			break;
		}
	}

}
