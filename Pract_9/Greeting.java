package Pract9;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Greeting extends JFrame implements ActionListener
{
	JTextField textField;
	JButton button;
	JLabel label;
	Greeting()
	{	
		textField=new JTextField(10);
		button=new JButton("Greet");
		label=new JLabel("Output");
		textField.setFont(new Font("verdana",Font.BOLD,18));
		button.setFont(new Font("verdana",Font.BOLD,18));
		label.setFont(new Font("verdana",Font.BOLD,18));
		button.setForeground(Color.WHITE);
		button.setBackground(Color.BLACK);
		textField.setBounds(50,20,400,30);
		button.setBounds(200,70,100,30);
		label.setBounds(50,100,400,30);
		add(textField);
		add(button);
		add(label);
		setLayout(null);
		setSize(500,500);
		setVisible(true);
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button)
		{
			String name=textField.getText();
			label.setText("Hello "+name+ "! Greeting of the day");
		}
	}
	public static void main(String args[])
	{
		new Greeting();
	}
}