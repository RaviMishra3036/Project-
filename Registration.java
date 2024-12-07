package mypack;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//import conn.Conn;

public class Registration extends JFrame implements ActionListener
	{
	JLabel l1, l2, l3, l4,l5,l6,l7,l8;
	JTextField t1,t2,t5,t6,t7;
	JPasswordField p1, p2;
	JButton b1,b2;
		
public Registration() {
			
	this.setSize(500,600);
	Container c = this.getContentPane();
	this.setTitle("Registration Form");	
	c.setBackground(Color.CYAN);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	l1 = new JLabel("Registration");
	l1.setForeground(Color.RED);
	l1.setBounds(170, 30, 150, 30);
	l1.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,25));
	this.add(l1);
			
	l2 = new JLabel("Student Name        :-");
	l2.setForeground(Color.BLACK);
	l2.setBounds(30, 90, 200, 30);
	l2.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,20));
	this.add(l2);
			

	l3 = new JLabel("Email Id                  :-");
	l3.setForeground(Color.BLACK);
	l3.setBounds(30, 140, 200, 30);
	l3.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,20));
	this.add(l3);
			
	l4 = new JLabel("Password                :-");
	l4.setForeground(Color.BLACK);
	l4.setBounds(30, 190, 200, 30);
	l4.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,20));
	this.add(l4);
			

	l5 = new JLabel("Confirm Password :-");
	l5.setForeground(Color.BLACK);
	l5.setBounds(30, 240, 200, 30);
	l5.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,20));
	this.add(l5);
			
	l6 = new JLabel("Phone Number       :-");
	l6.setForeground(Color.BLACK);
	l6.setBounds(30, 290, 200, 30);
	l6.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,20));
	this.add(l6);
			
	l7 = new JLabel("State                        :-");
	l7.setForeground(Color.BLACK);
	l7.setBounds(30, 340, 200, 30);
	l7.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,20));
	this.add(l7);
	
	l8 = new JLabel("City                         :-");
	l8.setForeground(Color.BLACK);
	l8.setBounds(30, 390, 200, 30);
	l8.setFont(new Font("Serif",Font.BOLD|Font.LAYOUT_NO_LIMIT_CONTEXT,20));
	this.add(l8);
			
	t1 = new JTextField();
	t1.setBounds(200, 95, 200, 30);
	this.add(t1);
			
	t2 = new JTextField();
	t2.setBounds(200, 145, 200, 30);
	this.add(t2);
			
	p1 = new JPasswordField();
	p1.setBounds(200, 195, 200, 30);
	this.add(p1);
			
	p2 = new JPasswordField();
	p2.setBounds(200, 245, 200, 30);
	this.add(p2);
			
	t5 = new JTextField();
	t5.setBounds(200, 295, 200, 30);
	this.add(t5);
			
	t6 = new JTextField();
	t6.setBounds(200, 345, 200, 30);
	this.add(t6);
	
	t7 = new JTextField();
	t7.setBounds(200, 395, 200, 30);
	this.add(t7);
			
	b1 = new JButton("Singup");
	b1.setBackground(Color.WHITE);
	b1.setForeground(Color.BLACK);
	b1.setBounds(100, 455, 100, 40);
	b1.setFont(new Font("Serif",Font.BOLD|Font.ROMAN_BASELINE,20));
	this.add(b1);
			
	b2 = new JButton("Clear");
	b2.setBackground(Color.WHITE);
	b2.setForeground(Color.BLACK);
	b2.setBounds(250, 455, 100, 40);
	b2.setFont(new Font("Serif",Font.BOLD|Font.ROMAN_BASELINE,20));
	this.add(b2);
			
	b1.addActionListener(this);
	b2.addActionListener(this);
			
	this.setLayout(null);
	this.setVisible(true);
	this.setResizable(false);		
		
	}
		
public void actionPerformed(ActionEvent e) 
	{
			
		if(e.getSource() == b1)
		{
			String s1 = t1.getText();
			String s2 = t2.getText();
			char[] s3 = p1.getPassword();
			char[] s4 = p2.getPassword();
			String s8 = new String(s3);
			String s9 = new String(s4);
			String s5 = t5.getText();
			String s6 = t6.getText();
			String s7 = t7.getText();
			
			if(s8.equals(s9))
			{	
				int i;
					
				try 
				{
					Connection con = conn.Conn.getCon();
					String ins = "insert into user values(?,?,?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(ins);
						
					ps.setString(1, s1);
					ps.setString(2, s2);
					ps.setString(3, s8);
					ps.setString(4, s5);
					ps.setString(5, s6);
					ps.setString(6, s7);
					i = ps.executeUpdate();
						
					if(i>0)
					{
						JOptionPane.showMessageDialog(this, "Data Inserted");
					}
					else
					{
						JOptionPane.showMessageDialog(this, "Data Not Inserted");
							
					}
				} 
				catch (Exception ex) 
				{
					ex.printStackTrace();
				}
			}
		}
			
		if(e.getSource()==b2)
		{
			t1.setText("");
			t2.setText("");
			p1.setText("");
			p2.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
		}
			
	}
	public static void main(String[] args) {
	new Registration();
	}
}
