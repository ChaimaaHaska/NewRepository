package org.sid;

public class Produit {
	
	private int id ; 
	private String name ;
	private int PrixEuro;
	
	
	public Produit(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getPrixEuro() {
		return PrixEuro;
	}
	public void setPrixEuro(int prixEuro) {
		PrixEuro = prixEuro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
	public int ToDh() {
		return this.PrixEuro*10;
	}
	
	public boolean isExpensive() {
		if( this.PrixEuro>100 ) return true ;
		return  false ;
	}
	
	

}
