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
import Login.MVC_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author DELL
 */
public class ControllerTampil{
    ModelTampil modeltampil;
    ViewTampil viewtampil;
    ViewEdit viewedit ;
   

    public ControllerTampil(ViewTampil vtp, ModelTampil mtp, ViewEdit ve) {
        this.modeltampil= mtp;
        this.viewtampil = vtp;
        this.viewedit= ve;
        
        viewedit.setVisible(false);
        
        if (modeltampil.getBanyakData()!= 0) {
            String dataMahasiswa[][] = modeltampil.readPeminjam();
            viewtampil.tabel.setModel((new JTable(dataMahasiswa, viewtampil.namaKolom)).getModel());
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        
        viewtampil.jbhapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int baris = viewtampil.tabel.getSelectedRow();
                 String idanggota = viewtampil.tabel.getValueAt(baris, 0).toString();
                 int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin menghapus Member " + idanggota + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                modeltampil.deletePeminjam(idanggota);

                String dataDaftar[][] = modeltampil.readPeminjam();
                viewtampil.tabel.setModel((new JTable(dataDaftar, viewtampil.namaKolom)).getModel());
                }
                else {
                JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
            
        });
        
       viewtampil.jbedit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                 new MVC_Edit();
            }
            
        });
       
       viewtampil.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                new MVC_Pinjam();   
            }
        });
        
        viewtampil.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(true);
                
            } 
        });
        
        viewtampil.jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                new MVC_About();
            }
            
        });
                
                
        viewtampil.jbhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewtampil.setVisible(false);
                new MVC_Home();
                
            }
            
        });
        
        viewtampil.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    viewtampil.setVisible(false);
                    new MVC_Login();
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }
                
            }
            
        });
        
        viewtampil.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                int baris = viewtampil.tabel.getSelectedRow();
                int kolom = viewtampil.tabel.getSelectedColumn(); // ga kepake sekarang

                String idanggota = viewtampil.tabel.getValueAt(baris, 0).toString();
                String nama = viewtampil.tabel.getValueAt(baris, 1).toString();
                String idbuku = viewtampil.tabel.getValueAt(baris, 2).toString();
                String judul = viewtampil.tabel.getValueAt(baris, 3).toString();
                
                viewtampil.jbhapus.setEnabled(true);
                viewtampil.jbedit.setEnabled(true);
                viewedit.jtidanggota.setText(idanggota);
                viewedit.jtnama.setText(nama);
                viewedit.jtidbuku.setText(idbuku);
                viewedit.jtjudul.setText(judul);
            }
        }
        );
    }
}
