package it.polito.tdp.librettovoti.model;
import java.util.*;
import java.time.LocalDate;

public class TestLibretto {
	
	public static void main(String[] args) {
	Libretto libretto=new Libretto();
	Voto voto1=new Voto("Analisi1",30,LocalDate.of(2019, 2, 15));
	libretto.add(voto1);
	libretto.add(new Voto("Fisica1", 24, LocalDate.of(2019, 7, 7)));
	libretto.add(new Voto("Informatica", 25, LocalDate.of(2019, 7, 7)));
	System.out.print(libretto);
	
	List<Voto> venticinque=libretto.StampaVotiUguali(25);
	System.out.println(venticinque);
	
    Libretto librvc=libretto.votiUguali(25);
    System.out.println(librvc);
}
}
