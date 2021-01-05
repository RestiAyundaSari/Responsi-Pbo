/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edit;

import Home.*;
import Pinjam.*;
import Tampil.*;
import Edit.*;
import About.*;

import javax.swing.*;

/**
 *
 * @author DELL
 */
public class ViewEdit extends JFrame  {
    JLabel jltitle1 = new JLabel("PERPUSTAKAAN ");
    
    JLabel jlidanggota= new JLabel("Id Anggota");
    JLabel jlnama= new JLabel("Nama ");
    JLabel jlidbuku= new JLabel("Id Buku ");
    JLabel jljudul= new JLabel("Judul Buku");
    public JTextField jtidanggota =  new JTextField();
    public JTextField jtnama =  new JTextField();
    public JTextField jtidbuku=  new JTextField();
    public JTextField jtjudul=  new JTextField();
    
    JButton jbtambah = new JButton("Edit");
    JButton jbatal = new JButton("Batal");
    JButton jbhome = new JButton("HOME");
    JButton jbpinjam = new JButton("PINJAM");
    JButton jbtampil = new JButton("TAMPIL");
    JButton jbabout = new JButton("ABOUT US");
    JButton jblogout = new JButton("LOGOUT");

    
    public ViewEdit (){
        
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(650,600); // x , y
        
        
        //TITLE =================================================================
        add(jltitle1);
        jltitle1.setBounds(250, 100, 300, 20);
        
        //ID ANGGOTA=================================================================
        add(jlidanggota);
        jlidanggota.setBounds(80, 140, 90, 20);
        add(jtidanggota);
        jtidanggota.setBounds(170, 140, 120, 20);
        
        //NAMA ANGGOTA =================================================================
        add(jlnama);
        jlnama.setBounds(80, 200, 90, 20);
        add(jtnama);
        jtnama.setBounds(170, 200, 120, 20);
        
        //ID BUKU =================================================================
        add(jlidbuku);
        jlidbuku.setBounds(80, 260, 90, 20);
        add(jtidbuku);
        jtidbuku.setBounds(170, 260, 120, 20);
        
        //JUDUL =================================================================
        add(jljudul);
        jljudul.setBounds(80, 320, 90, 20);
        add(jtjudul);
        jtjudul.setBounds(170, 320, 120, 20);
        
        // BUTTON ==============================================================
        add(jbtambah);
        jbtambah.setBounds(60, 400, 90, 20);
        
        add(jbatal);
        jbatal.setBounds(210, 400, 90, 20);
        
        add(jbhome);
        jbhome.setBounds(440, 160, 100, 30);
        
        add(jbpinjam);
        jbpinjam.setBounds(440, 210, 100, 30);
        
        add(jbtampil);
        jbtampil.setBounds(440, 260, 100, 30);
        
        add(jbabout);
        jbabout.setBounds(440, 310, 100, 30);
        
        add(jblogout);
        jblogout.setBounds(440, 60, 100, 30);

    }
    public String getIdanggota() {
        return jtidanggota.getText();
    }

    public String getNama() {
        return jtnama.getText();
    }
    
    public String getIdbuku() {
        return jtidbuku.getText();
    }
    
    public String getJudul() {
        return jtjudul.getText();
    }
    
   
}
