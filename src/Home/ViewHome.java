/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;


import Home.*;
import Pinjam.*;
import Tampil.*;
import Edit.*;
import About.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author DELL
 */
public class ViewHome extends JFrame{
    JLabel jltitle1 = new JLabel("PERPUSTAKAAN ");
    JLabel jltitle2 = new JLabel("SELAMAT DATANG DIPERPUSTAKAAN ");
    
    
    JButton jbhome = new JButton("HOME");
    JButton jbpinjam = new JButton("PINJAM");
    JButton jbtampil = new JButton("TAMPIL");
    JButton jbabout = new JButton("ABOUT US");
    JButton jblogout = new JButton("LOGOUT");
    
    public ViewHome (){
        
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(650,600); // x , y
        
        
        //TITLE =================================================================
        add(jltitle1);
        jltitle1.setBounds(250, 100, 300, 20);
        add(jltitle2);
        jltitle2.setBounds(240, 270, 300, 20);
        
        
        // BUTTON ==============================================================
        add(jbhome);
        jbhome.setBounds(60, 130, 130, 40);
        
        add(jbpinjam);
        jbpinjam.setBounds(60, 210, 130, 40);
        
        add(jbtampil);
        jbtampil.setBounds(60, 290, 130, 40);
        
        add(jbabout);
        jbabout.setBounds(60, 370, 130, 40);
        
        add(jblogout);
        jblogout.setBounds(410, 60, 130, 40);

    }
    
    
}
