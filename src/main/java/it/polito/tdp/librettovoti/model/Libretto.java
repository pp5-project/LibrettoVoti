package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.*;

public class Libretto {
	
	private List<Voto> voti;
	public Libretto() {
		this.voti=new ArrayList<>();
		
	}
	public void add(Voto v) {
		this.voti.add(v);
	}
	public String toString() {
		String s="";
		for( Voto v:this.voti) {
			s=s+v.toString()+"\n";
		}
		return s;
	}
	
	public List<Voto> StampaVotiUguali(int punteggio) {
		List<Voto> risultato=new ArrayList<>();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	public Libretto votiUguali(int punteggio) {
		Libretto risultato=new Libretto();
		for(Voto v:this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	public Voto CercaVoto(String nomeCorso) {
		Voto risultato=null;
		for(Voto v:this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato=v;
				break;
			}
		}
		return risultato;
		
			
	}

}
