package io;

import java.util.Scanner;

public class CifraturaMonoAlfabetica {
	private static 	int random;
	public static int getrandom() {return random;}
	public static int createrandom() {return ((int)(Math.random()*10))+1;}
public static void main (String [] args ) {
	
	String cifrare=null;;
	String criptata=null;
	System.out.println("Inserire una frase che si vuole criptare con la cifratura mono alfabetica");
	Scanner a=new Scanner (System.in);
	cifrare=a.nextLine();
	criptata=cifratura(cifrare);
	System.out.println(criptata);
}
public static String cifraturaMonoAlfabetica(int valore,int chiave ) {
	String cifrata = null;
	int y=0;
	if (valore==32) {
		cifrata=" ";
		y=1;
	}
	if(y!=1) {
		int valorechar=0;
		valore=valore+chiave;
		if(valore>122) {
			valorechar=valore-122;
			cifrata=String.valueOf(((char)(valorechar+97)));
		}
		else {
			cifrata=String.valueOf(((char)(valore)));
		}
		
	}

	
	
	return cifrata;
}
public static String cifratura(String cifrare) {
	String criptata=null;
random=createrandom();
	System.out.println(random);
	//cifrare=cifrare.toLowerCase();
	int t=cifrare.length();
	
	for(int i=0;i<t;i++) {
		int codiceAscii=(int)(cifrare.charAt(i));
		if(i==0) {
			criptata=cifraturaMonoAlfabetica(codiceAscii,random);
		}
		else {
	criptata=criptata+cifraturaMonoAlfabetica(codiceAscii,random);}
	}
	return criptata;
}
}