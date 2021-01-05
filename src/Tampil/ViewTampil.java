/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampil;

import Home.*;
import Pinjam.*;
import Tampil.*;
import Edit.*;
import About.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class ViewTampil extends JFrame{
    JLabel jltitle1 = new JLabel("PERPUSTAKAAN ");
    JLabel jltitle2 = new JLabel("LIST BUKU YANG DIPINJAM ");
    
    
    JButton jbedit = new JButton("Edit");
    JButton jbhapus = new JButton("Hapus");
    JButton jbhome = new JButton("HOME");
    JButton jbpinjam = new JButton("PINJAM");
    JButton jbtampil = new JButton("TAMPIL");
    JButton jbabout = new JButton("ABOUT US");
    JButton jblogout = new JButton("LOGOUT");
    
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Id Anggota", "Nama", "Id Buku"," Judul"};
    
    public ViewTampil(){
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("PERPUSTAKAAN");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setSize(650,600); // x , y
        
        
        add(scrollPane);
        scrollPane.setBounds(20, 220, 400, 300);
        
        
        //TITLE =================================================================
        add(jltitle1);
        jltitle1.setBounds(160, 40, 300, 20);
       
        add(jltitle2);
        jltitle2.setBounds(150, 170, 300, 20);
        
        
        // BUTTON ==============================================================
        add(jbedit);
        jbedit.setBounds(60, 100, 90, 20);
        
        add(jbhapus);
        jbhapus.setBounds(210, 100, 90, 20);
        
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
}
