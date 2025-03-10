package pkg123230151_if.b_kuis;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PurchasePage extends JFrame {
    private static final int[] price = {15000, 12000, 20000};
    
    public PurchasePage(String user, int apelQ, int jerukQ, int manggaQ) {
        setTitle("Halaman Pembelian");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        // Order Merge Panel
        int totalApel = apelQ * price[0];
        int totalJeruk = jerukQ * price[1];
        int totalMangga = manggaQ * price[2];
        
        JPanel orderPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        orderPanel.add(new JLabel("Apel: " + apelQ + " kg x Rp15.000 = Rp" + totalApel));
        orderPanel.add(new JLabel("Jeruk: " + jerukQ + " kg x Rp12.000 = Rp" + totalJeruk));
        orderPanel.add(new JLabel("Mangga: " + manggaQ + " kg x Rp20.000 = Rp" + totalMangga));
        
        // Summary Panel
        double subtotal = totalApel + totalJeruk + totalMangga;
        double pajak = 0.1 * subtotal;
        double totalharga = subtotal + pajak;
        
        JPanel summaryPanel = new JPanel(new GridLayout(4, 1, 10, 10));
        summaryPanel.add(new JLabel());
        summaryPanel.add(new JLabel("Subtotal: Rp" + subtotal));
        summaryPanel.add(new JLabel("Pajak(10%): Rp" + pajak));
        summaryPanel.add(new JLabel("Total Harga: Rp" + totalharga));
        
        // Kembali
        JButton kembali = new JButton("Kembali");
        
        add(orderPanel, BorderLayout.NORTH);
        add(summaryPanel, BorderLayout.CENTER);
        add(kembali, BorderLayout.SOUTH);
        
        kembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new HomePage(user);
            }
        });
    }
    
    
}
