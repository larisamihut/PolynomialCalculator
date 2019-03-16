package controller;

import model.Monom;
import model.Polinom;

public class Sub extends Operatii {

	public Polinom getOperatie(Polinom p1, Polinom p2) {
		Polinom p = new Polinom();
		p.getM().addAll(p1.getM());
		for(Monom monom: p2.getM()) {
			monom.setValoare(-monom.getValoare());
		}
		p.getM().addAll(p2.getM());
		p.sortare();
		p = getSub(p);
		return p;
	}
	
	public Polinom getSub(Polinom p) {
		for(int i = 0; i< p.getM().size()-1;i++)
			for(int j = i+1; j<p.getM().size(); j++) {
				if (p.getM().get(i).getPutere() == p.getM().get(j).getPutere()) {
					int valoare = p.getM().get(i).getValoare() - p.getM().get(j).getValoare();
					p.getM().get(i).setValoare(valoare);
					p.getM().remove(j);
				}
			}
		return p;
	}
}
