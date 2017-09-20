package fr.ybf.ocpjp.date.local;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nL13n {

	public static void main(String[] args) {
		Locale	locale	=	Locale.getDefault(); 
		System.out.println(locale);
		
		System.out.println(Locale.getDefault());	//	en_US Locale	
//		locale	=	new	Locale("us", "EN"); 
		Locale.setDefault(locale);		//	change	the	default 
		System.out.println(Locale.getDefault());	//	fr
		
		ResourceBundle rb = ResourceBundle.getBundle("Test", locale.getDefault());
		System.out.println(rb.getBundle("hello"));

	}

}
