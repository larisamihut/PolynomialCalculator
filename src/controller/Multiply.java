package controller;
import model.Monom;
import model.Polinom;

public class Multiply extends Operatii{

	public Polinom getOperatie(Polinom p1, Polinom p2) {
		p = new Polinom();
		for(int i = 0; i<p1.getM().size();i++)
			for(int j = 0; j<p2.getM().size(); j++) {
				int valoare = p1.getM().get(i).getValoare() * p2.getM().get(j).getValoare();
				int putere = p1.getM().get(i).getPutere() * p2.getM().get(j).getPutere();
				Monom monom = new Monom(valoare, putere);
				p.addMonom(monom);
			}
		return p;
	}
}
