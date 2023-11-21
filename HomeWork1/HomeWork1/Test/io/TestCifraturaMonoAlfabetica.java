package io;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestCifraturaMonoAlfabetica {


public void outputTestCifraturaMonoAlfabetica() {
	Assertions.assertAll("outputTestCifraturaMonoAlfabetica",
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(97, 3).equals("d")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(97, 4).equals("e")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(97, 5).equals("f")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(97, 6).equals("g")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(97, 7).equals("h")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(97, 8).equals("i")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(48, 0).equals("0")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(52, 4).equals("8")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(80, 2).equals("R")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(40, 5).equals("-")),
	()->assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(57, 6).equals("?"))
	
	);
}

public void outputTestcifratura() {
	String prova="Ciao come va oggi";
	String container=prova;
	prova=CifraturaMonoAlfabetica.cifratura(prova);
	//System.out.println(container+"\n"+prova+"\n"+CifraturaMonoAlfabetica.getrandom());
	assertTrue(!prova.equals(container));
	assertTrue(prova.length()==container.length());
}


public void NulloutputTest() {
	String prova="";
	assertTrue(CifraturaMonoAlfabetica.cifratura(prova)==null);
}

public void EmptyoutputTest() {
	String prova=" ";
	assertTrue(CifraturaMonoAlfabetica.cifratura(prova).equals(prova));
}

@Test
public void ParticularoutputTest() {
	assertTrue(!CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(122, 3).equals("}"));
	assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(122, 3).equals("d"));
	assertTrue(!CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(123, 2).equals("}"));
	assertTrue(CifraturaMonoAlfabetica.cifraturaMonoAlfabetica(123, 3).equals("e"));
}



























}