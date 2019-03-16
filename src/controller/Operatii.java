package controller;


import model.Polinom;

public class Operatii {
	public Polinom p;
	
	public Polinom getOperatie(Polinom p1, Polinom p2){
		p = new Polinom();
		p.getM().addAll(p1.getM());
		p.getM().addAll(p2.getM());
		return p;
	}
}
