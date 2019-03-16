package model;

public class Monom implements Comparable<Object> {
private int valoare;
private int putere;

	public Monom(int valoare,int putere){
	setValoare(valoare);
	setPutere(putere);
	}
	
	public int getValoare() {
		return valoare;
	}
	
	public int getPutere() {
		return putere;
	}
	
	public void setValoare(int valoare) {
		this.valoare = valoare;
	}
	
	public void setPutere(int putere) {
		this.putere = putere;
	}
	
	
	@Override
	public String toString() {
		return (valoare + "x^" + putere);
	}

	@Override
	public int compareTo(Object m) {
		int comparePutere = ((Monom)m).getPutere();
		return this.putere - comparePutere;
	}

}
