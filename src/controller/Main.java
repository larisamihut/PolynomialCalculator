package controller;

import model.Monom;
import model.Polinom;
import view.Interfata;

public class Main {

	public static void main(String[] args) {
		Interfata i = new Interfata();	
		
		Monom m1 = new Monom(2,2);
		Monom m2 = new Monom(1,5);
		Monom m3 = new Monom(4,3);
		Monom m8 = new Monom(7,7);
		Polinom p = new Polinom();
		p.addMonom(m1);
		p.addMonom(m2);
		p.addMonom(m3);
		p.addMonom(m8);
		System.out.println(p.sortare());
		
		Monom m4 = new Monom(2,4);
		Monom m5 = new Monom(2,5);
		Monom m6 = new Monom(4,8);
		Polinom p1 = new Polinom();
		p1.addMonom(m4);
		p1.addMonom(m5);
		p1.addMonom(m6);
		System.out.println(p1.sortare());
		
		Sum sum = new Sum();
		Sub sub = new Sub();
		Multiply mul = new Multiply();
		System.out.println(mul.getOperatie(p, p1).sortare());
		System.out.println(sum.getOperatie(p, p1).sortare());
		System.out.println(sub.getOperatie(p, p1).sortare());
	}
}
