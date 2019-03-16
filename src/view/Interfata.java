package view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import controller.Multiply;
import controller.Operatii;
import controller.Sub;
import controller.Sum;
import model.Monom;
import model.Polinom;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Label;

public class Interfata extends Frame implements ActionListener, WindowListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Label l;
	private TextField t1,t2,t3,t4,t5,t6,t7;
	private Button b1,b2,b3,b4,b5;
	private Polinom p1,p2;
	private Sum sum;
	private Sub sub;
	private Multiply mul;
	
	public Interfata() {
		p1 = new Polinom();
		p2 = new Polinom();
		sum = new Sum();
		sub = new Sub();
		mul = new Multiply();
		
		
		setLayout(new FlowLayout());
		this.setFirstPol();
		this.setSecondPol();
		setResult();
		addWindowListener(this);
		setTitle("Calculator Polinomial");
		setSize(350,300);
		setVisible(true);
	}
	
	public Label addLabel(String s) {
		Label l = new Label(s);
		add(l);
		return l;
	}
	
	public TextField addTextField(boolean b, int dim1, int dim2) {
		TextField t = new TextField();
		t.setEditable(b);
		t.setPreferredSize(new Dimension(dim1, dim2));
		add(t);
		return t;
	}
	
	
	public Button addButton(String s) {
		Button b = new Button(s);
		add(b);
		return b;
	}
	
	public void setButton(Button b1, TextField t1, TextField t2, Polinom p1, TextField t3) {
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int val1 = Integer.parseInt(t1.getText());
				int putere1 = Integer.parseInt(t2.getText());
				Monom m1 = new Monom(val1,putere1);
				p1.addMonom(m1);
				t3.setText(p1.sortare() + "");
			}
		});
	}
	
	public void setButtonOperatii(Button b, TextField t, Operatii o) {
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Polinom p = o.getOperatie(p1, p2);
				t.setText(p.sortare() + "");
			}
		});
	}
	
	public void setFirstPol() {
		addLabel("First polynomial");
		addLabel("value");
		t1 = addTextField(true, 25, 25);
		addLabel("power");
		t2 = addTextField(true, 25, 25);
		b1 = addButton("add");
		t3 = addTextField(false, 320, 25);
		setButton(b1,t1,t2,p1,t3);
	}
	
	public void setSecondPol() {
		addLabel("Second polynomial");
		addLabel("value");
		t4 = addTextField(true, 25, 25);
		addLabel("power");
		t5 = addTextField(true, 25, 25);
		b2 = addButton("add");
		t6 = addTextField(false, 320, 25);
		setButton(b2, t4, t5, p2, t6);
	}
	
	public void setResult() {
		b3 = addButton("+");
		b4 = addButton("-");
		b5 = addButton("*");
		t7 = addTextField(false, 320, 25);
		setButtonOperatii(b3,t7,sum);
		setButtonOperatii(b4,t7,sub);
		setButtonOperatii(b5,t7,mul);
	}

	@Override
	public void windowClosing(WindowEvent evr) {
		System.exit(0);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
	}

	@Override
	public void windowOpened(WindowEvent arg0) {	
	}
}