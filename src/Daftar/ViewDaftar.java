/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author DELL
 */
public class ViewDaftar extends JFrame {
    JLabel jltitle = new JLabel("DAFTAR");
    JLabel jluser = new JLabel("Username ");
    JTextField jtuser = new JTextField();
    JLabel jlpass = new JLabel("Password ");
    JTextField jtpass =  new JTextField();
    
    JButton btndaftar = new JButton("Daftar");
    JButton btnbatal = new JButton("Batal");
    JButton btnexit = new JButton("Exit");
    
    public ViewDaftar()
    {
        setTitle("Daftar");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(650,600);
        setLocationRelativeTo(null);
        
        //TITLE =================================================================
        add(jltitle);
        jltitle.setBounds(280, 120, 90, 20);
        
        //USER =================================================================
        add(jluser);
        jluser.setBounds(180, 200, 90, 25);
        add(jtuser);
        jtuser.setBounds(250, 200, 120, 25);
        
        //PASS =================================================================
        add(jlpass);
        jlpass.setBounds(180, 260, 90, 25);
        add(jtpass);
        jtpass.setBounds(250, 260, 120, 25);
        
        // BUTTON ==============================================================
        add(btndaftar);
        btndaftar.setBounds(160, 340, 90, 20);
        add(btnbatal);
        btnbatal.setBounds(300, 340, 90, 20);
        add(btnexit);
        btnexit.setBounds(450, 40, 80, 25);
        
    }

    public String getUser() {
        return jtuser.getText();
    }

    public String getPass() {
        return jtpass.getText();
    }
    
}
