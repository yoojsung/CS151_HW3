package Exercise2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class NumberView extends JFrame {
	
	public NumberView(int n1, int n2, int n3, Number n) {	
		setTitle("NumberView");
		JLabel l1 = new JLabel("Strawberry  ");
		l1.setForeground(Color.red);
		l1.setFont(new Font("Roboto", Font.BOLD, 20));
		add(l1);
		JTextField textfield1 = new JTextField(10);
		textfield1.setText(n1 + "");
		add(textfield1);
		JLabel l2 = new JLabel(" Blueberry    ");
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Roboto", Font.BOLD, 20));
		add(l2);
		JTextField textfield2 = new JTextField(10);
		textfield2.setText(n2 + "");
		add(textfield2);
		JLabel l3 = new JLabel("     	Melon       ");
		l3.setForeground(Color.green);
		l3.setFont(new Font("Roboto", Font.BOLD, 20));
		add(l3);
		JTextField textfield3 = new JTextField(10);
		textfield3.setText(n3 + "");
		add(textfield3);
		JButton button = new JButton("Update");
		add(button);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		setSize(300, 200);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);

		button.addActionListener(event -> {n.updateValues(Integer.parseInt(textfield1.getText()), Integer.parseInt(textfield2.getText()), Integer.parseInt(textfield3.getText()));});
	}
	
	public void paint(Graphics g) {
		super.paint(g);
	}
	
}
