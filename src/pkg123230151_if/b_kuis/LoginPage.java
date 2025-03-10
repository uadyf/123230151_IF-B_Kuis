package pkg123230151_if.b_kuis;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage {

    public LoginPage() {
        JFrame frame = new JFrame("Halaman Login");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        
        // User Information Panel
        JPanel credentialPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        JLabel uText = new JLabel("Username: ");
        JTextField uInput = new JTextField();
        JLabel pText = new JLabel("Password: ");
        JPasswordField pInput = new JPasswordField();
        credentialPanel.add(uText);
        credentialPanel.add(uInput);
        credentialPanel.add(pText);
        credentialPanel.add(pInput);
        
        // Button Panel
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        JButton loginButton = new JButton("Login");
        JButton resetButton = new JButton("Reset");
        buttonPanel.add(loginButton);
        buttonPanel.add(resetButton);
        
        frame.add(credentialPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = uInput.getText();
                String password = pInput.getText();
                
                // JANGAN LUPA GANTI KALO UDAH MAU SUBMIT
                if(username.equals("Auladi") && password.equals("123230151")) {
                    frame.dispose();
                    HomePage homePage = new HomePage(username);
                    homePage.setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password", "Login Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uInput.setText("");
                pInput.setText("");
            }
        });
        frame.setVisible(true);
    }
    
    
}
