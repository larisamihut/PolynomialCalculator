package model;
import java.util.*;

public class Polinom {
	private ArrayList<Monom> m = new ArrayList<Monom>();
	
	public void addMonom(Monom monom) {
		getM().add(monom);
	}
	
	public String sortare() {
		Collections.sort(getM());
		return toString();
	}
	
	public ArrayList<Monom> checkPutere() {
		for(int i = 0; i< getM().size()-1;i++)
			for(int j = i+1; j<getM().size(); j++) {
				if (getM().get(i).getPutere() == getM().get(j).getPutere()) {
					int valoare = getM().get(i).getValoare() + getM().get(j).getValoare();
					getM().get(i).setValoare(valoare);
					getM().remove(j);
				}
			}
		return getM();
	}
	
	@Override
	public String toString() {
		String result ="";
		setM(checkPutere());
		for(Monom monom:getM() ) {
			result += "+" + "(" + monom.toString() + ")";
		}
		return result;
	}

	public ArrayList<Monom> getM() {
		return m;
	}

	public void setM(ArrayList<Monom> m) {
		this.m = m;
	}
	
	
}
