package pkg123230151_if.b_kuis;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomePage extends JFrame {
    
    public HomePage(String user) {
        setTitle("Halaman Utama");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        JLabel welcomLabel = new JLabel("Selamat Datang, " + user);
        
        // Input Panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        inputPanel.add(new JLabel("Apel (Rp15.000/kg): "));
        JTextField apelQ = new JTextField("0");
        inputPanel.add(apelQ);
        inputPanel.add(new JLabel("Jeruk (Rp12.000/kg): "));
        JTextField jerukQ = new JTextField("0");
        inputPanel.add(jerukQ);
        inputPanel.add(new JLabel("Mangga (Rp20.000/kg): "));
        JTextField manggaQ = new JTextField("0");
        inputPanel.add(manggaQ);
        
        // Button Panel
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        JButton buyButton = new JButton("Beli");
        JButton logoutButton = new JButton("Logout");
        buttonPanel.add(buyButton);
        buttonPanel.add(logoutButton);
        
        add(welcomLabel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        
        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int apelQuantity = Integer.parseInt(apelQ.getText());
                int jerukQuantity = Integer.parseInt(jerukQ.getText());
                int manggaQuantity = Integer.parseInt(manggaQ.getText());
                
                dispose();
                PurchasePage purchasePage = new PurchasePage(user, apelQuantity, jerukQuantity, manggaQuantity);
                purchasePage.setVisible(true);
            }
        });
        
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new LoginPage();
            }
        });
    }
    
    
}
