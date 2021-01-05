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
import Login.MVC_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ControllerEdit {
     ModelEdit modeledit;
     ViewEdit viewedit;
    
    public ControllerEdit(ViewEdit ve, ModelEdit me) {
        this.viewedit = ve;
        this.modeledit = me;
        
        if (modeledit.getBanyakData() != 0) {
            String dataMahasiswa[][] = modeledit.readPeminjam();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewedit.jbtambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idanggota = viewedit.getIdanggota();
                String nama = viewedit.getNama();
                String idbuku = viewedit.getIdbuku();
                String judul = viewedit.getJudul();
                modeledit.updatePeminjam(idanggota,nama,idbuku);

                String dataDaftar[][] = modeledit.readPeminjam();
            }
            
        });
        
        viewedit.jbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                new MVC_Home();
            }
            
        });
        
        viewedit.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                new MVC_Pinjam();
                
            }
            
        });
        
        viewedit.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                new MVC_Tampil();
                
            }
            
        });
        
        viewedit.jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                new MVC_About();
            }
            
        });
                
                
        viewedit.jbhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewedit.setVisible(false);
                new MVC_Home();
                
            }
            
        });
        
         viewedit.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    viewedit.setVisible(false);
                    new MVC_Login();
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }
                
            }
            
        });
    }
    
    
}
