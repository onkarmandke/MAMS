package windowManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * First screen of the software thus contains main method
 */
public class Login {
	
	private JTextField userName;
	private JPasswordField passWord;
	private JFrame loginFrame;
	private JPanel loginPanel;
	private JLabel userLabel,passLabel;
	private JButton loginButton;
	private BoxLayout frameLayout;
	private GridLayout panelLayout;
	
	/**
	 * Default and only constructor of the class
	 * Constructs frame for accepting user input of username and password
	 * Opens home-page of the software if credentials are valid
	 */
	public Login() {
		loginFrame=new JFrame("Login");
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLayout=new BoxLayout(loginFrame.getContentPane(),BoxLayout.Y_AXIS);
		loginFrame.setLayout(frameLayout);
		userName=new JTextField(20);
		passWord=new JPasswordField(20);
		userLabel=new JLabel("Username");
		passLabel=new JLabel("Password");
		loginButton=new JButton("Login");
		loginPanel=new JPanel();
		panelLayout=new GridLayout(2,2);
		loginPanel.setLayout(panelLayout);
		loginPanel.add(userLabel);
		loginPanel.add(userName);
		loginPanel.add(passLabel);
		loginPanel.add(passWord);
		loginFrame.add(loginPanel);
		loginFrame.add(loginButton);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				new HomePage();
				loginFrame.dispose();
			}
		});
		loginFrame.pack();
		loginFrame.setResizable(false);
		loginFrame.setVisible(true);
		loginFrame.setLocationRelativeTo(null);
	}
	
	/**
	 * Main method of the software
	 * Launches the software by giving call to the Login class constructor
	 */
	public static void main(String args[]) {
		new Login();
		//new HomePage();
		//new Search();
		//new Insert();
		//new Update();
		//new Delete();
		return;
	}
}
