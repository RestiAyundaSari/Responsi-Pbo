/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pinjam;

import Home.*;
import Pinjam.*;
import Tampil.*;
import Edit.*;
import About.*;
import Login.MVC_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ControllerPinjam {
    
    ModelPinjam modelpinjam;
    ViewPinjam viewpinjam;
    
    public ControllerPinjam(ViewPinjam vp, ModelPinjam mp) {
        this.viewpinjam = vp;
        this.modelpinjam = mp;
        
        if (modelpinjam.getBanyakData() != 0) {
            String dataMahasiswa[][] = modelpinjam.readPeminjam();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewpinjam.jbtambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idanggota = viewpinjam.getIdanggota();
                String nama = viewpinjam.getNama();
                String idbuku = viewpinjam.getIdbuku();
                String judul = viewpinjam.getJudul();
                modelpinjam.insertPeminjam(idanggota,nama,idbuku,judul);
                viewpinjam.jtidanggota.setText("");
                viewpinjam.jtnama.setText("");
                viewpinjam.jtidbuku.setText("");
                viewpinjam.jtjudul.setText("");

                String dataDaftar[][] = modelpinjam.readPeminjam();
            }
            
        });
        
        viewpinjam.jbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                    new ViewHome();
            }
            
        });
        
        viewpinjam.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                new MVC_Pinjam();
                
            }
            
        });
        
        viewpinjam.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                new MVC_Tampil();
                
            }
            
        });
        
        viewpinjam.jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                new MVC_About();
            }
            
        });
                
                
        viewpinjam.jbhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewpinjam.setVisible(false);
                new MVC_Home();
                
            }
            
        });
        
        viewpinjam.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    viewpinjam.setVisible(false);
                    new MVC_Login();
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }
                
            }
            
        });
    }
    
}
