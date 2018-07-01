package edu.app;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import edu.milkacanic.Option;

public class Aplikacija {

	private JFrame frame;
	private JTextField txtPomoc;
	private JTextField txtUpis;
     Option o=new Option();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplikacija window = new Aplikacija();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Aplikacija() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPomoc = new JTextField();
		txtPomoc.setBounds(254, 72, 86, 20);
		frame.getContentPane().add(txtPomoc);
		txtPomoc.setColumns(10);
		
		JButton btnp = new JButton("Pomoc");
		btnp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtPomoc.setText(o.pomoc());
			}
		});
		btnp.setBounds(251, 117, 89, 23);
		frame.getContentPane().add(btnp);
		
		txtUpis = new JTextField();
		txtUpis.setBounds(40, 72, 111, 20);
		frame.getContentPane().add(txtUpis);
		txtUpis.setColumns(10);
		
		JButton btnPogodi = new JButton("Pogodi");
		btnPogodi.addActionListener(new ActionListener() {
			int i=0;
			public void actionPerformed(ActionEvent arg0) {
				
				if(i<=5){
				if(txtUpis.getText()==o.GenrisanjeReci()){
					JOptionPane.showMessageDialog(frame,
						    "Pogodili ste.");
				}else{
					JOptionPane.showMessageDialog(frame,
						    "Niste Pogodili Pokusajte Ponovo.");
				}
				  i++;
				}
				
			}
		});
		btnPogodi.setBounds(53, 117, 89, 23);
		frame.getContentPane().add(btnPogodi);
	}
}
