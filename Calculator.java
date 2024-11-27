package mypack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmult,bzero,bduzero,bpoint,bdiv,bequal,ball,brem,bcut;
	double a, b, c=0;
	int op;
	
	
public Calculator() 
{
	this.setSize(400, 500);
	this.setTitle("Calc");
	this.getContentPane().setBackground(Color.CYAN);
	this.setLayout(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setResizable(false);
	
	// Label
	
	l1 = new JLabel("Calculator");
	l1.setBounds(125, 20, 150, 30);
	l1.setForeground(Color.BLACK);
	l1.setFont(new Font("serif",Font.BOLD|Font.HANGING_BASELINE, 30));
	this.add(l1);
	
	//JTextField
	
	t1 = new JTextField();
	t1.setBounds(60, 80, 250, 40);
	this.add(t1);
	
	// JButton
	
	ball = new JButton("Ac");
	ball.setBounds(60, 140, 55, 30);
	this.add(ball);
	ball.addActionListener(this);
	
	brem = new JButton("%");
	brem.setBounds(125, 140, 55, 30);
	this.add(brem);
	brem.addActionListener(this);
	
	bcut = new JButton("del");
	bcut.setBounds(190, 140, 55, 30);
	this.add(bcut);
	bcut.addActionListener(this);
	
	badd = new JButton("+");
	badd.setBounds(255, 140, 55, 30);
	this.add(badd);
	badd.addActionListener(this);
	
	//1st
	
	b1 = new JButton("1");
	b1.setBounds(60, 180, 55, 30);
	this.add(b1);
	b1.addActionListener(this);
	
	
	b2 = new JButton("2");
	b2.setBounds(125, 180, 55, 30);
	this.add(b2);
	b2.addActionListener(this);
	
	b3 = new JButton("3");
	b3.setBounds(190, 180, 55, 30);
	this.add(b3);
	b3.addActionListener(this);
	
	bsub = new JButton("-");
	bsub.setBounds(255, 180, 55, 30);
	this.add(bsub);
	bsub.addActionListener(this);
	
	//2nd
	
	b4 = new JButton("4");
	b4.setBounds(60, 220, 55, 30);
	this.add(b4);
	b4.addActionListener(this);

	
	b5 = new JButton("5");
	b5.setBounds(125, 220, 55, 30);
	this.add(b5);
	b5.addActionListener(this);
	
	
	b6 = new JButton("6");
	b6.setBounds(190, 220, 55, 30);
	this.add(b6);
	b6.addActionListener(this);


	bmult = new JButton("*");
	bmult.setBounds(255, 220, 55, 30);
	this.add(bmult);
	bmult.addActionListener(this);
	
	//3th
	
	b7 = new JButton("7");
	b7.setBounds(60, 260, 55, 30);
	this.add(b7);
	b7.addActionListener(this);

	
	b8 = new JButton("8");
	b8.setBounds(125, 260, 55, 30);
	this.add(b8);
	b8.addActionListener(this);

	
	b9 = new JButton("9");
	b9.setBounds(190, 260, 55, 30);
	this.add(b9);
	b9.addActionListener(this);

	
	bdiv = new JButton("/");
	bdiv.setBounds(255, 260, 55, 30);
	this.add(bdiv);
	bdiv.addActionListener(this);

	
	
	//4th
	
	bduzero = new JButton("00");
	bduzero.setBounds(60, 300, 55, 30);
	this.add(bduzero);
	bduzero.addActionListener(this);

	
	bzero= new JButton("0");
	bzero.setBounds(125, 300, 55, 30);
	this.add(bzero);
	bzero.addActionListener(this);

	
	bpoint = new JButton(".");
	bpoint.setBounds(190, 300, 55, 30);
	this.add(bpoint);
	bpoint.addActionListener(this);

	

	bequal = new JButton("=");
	bequal.setBounds(255, 300, 55, 30);
	bequal.setBackground(Color.ORANGE);
	this.add(bequal);
	bequal.addActionListener(this);

	
	this.setVisible(true);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==b1)
		t1.setText(t1.getText().concat("1"));
	if(e.getSource()==b2)
		t1.setText(t1.getText().concat("2"));
	if(e.getSource()==b3)
		t1.setText(t1.getText().concat("3"));
	if(e.getSource()==b4)
		t1.setText(t1.getText().concat("4"));
	if(e.getSource()==b5)
		t1.setText(t1.getText().concat("5"));
	if(e.getSource()==b6)
		t1.setText(t1.getText().concat("6"));
	if(e.getSource()==b7)
		t1.setText(t1.getText().concat("7"));
	if(e.getSource()==b8)
		t1.setText(t1.getText().concat("8"));
	if(e.getSource()==b9)
		t1.setText(t1.getText().concat("9"));
	if(e.getSource()==bduzero)
		t1.setText(t1.getText().concat("00"));
	if(e.getSource()==bzero)
		t1.setText(t1.getText().concat("0"));
	if(e.getSource()==bpoint)
		t1.setText(t1.getText().concat("."));
	
	
	if(e.getSource()==badd)
	{
		a = Double.parseDouble(t1.getText());
		t1.setText("");
		op = 1;
	}
	
	if(e.getSource()==bsub)
	{
		a = Double.parseDouble(t1.getText());
		t1.setText("");
		op = 2;
	}
	
	if(e.getSource()==bmult)
	{
		a = Double.parseDouble(t1.getText());
		t1.setText("");
		op = 3;
	}
	
	if(e.getSource()==bdiv)
	{
		a = Double.parseDouble(t1.getText());
		t1.setText("");
		op = 4;
	}
	
	if(e.getSource()==brem)
	{
		a = Double.parseDouble(t1.getText());
		t1.setText("");
		op = 5;
	}
	
	if(e.getSource() == bequal)
	{
		b =Double.parseDouble(t1.getText());
		
		switch (op) 
		{
			case 1:
				c = a+b;
				break;
			case 2:
				c = a-b;
				break;
			case 3:
				c = a*b;
				break;
			case 4:
				c = a/b;
				break;
			case 5:
				c = a%b;
				break;
			default:
				JOptionPane.showMessageDialog(this, "Enter Vaild Input ");
		}
		
		String res = String.valueOf(c);
		t1.setText(res);
	}
	
}

public static void main(String[] args) {
	new Calculator();
}

}
