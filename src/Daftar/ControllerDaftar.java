/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;

import Login.MVC_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ControllerDaftar {
    ModelDaftar modeldaftar;
    ViewDaftar viewdaftar;
    
    public ControllerDaftar(ViewDaftar vd, ModelDaftar md) {
        this.viewdaftar = vd;
        this.modeldaftar = md;
        
        if (modeldaftar.getBanyakData() != 0) {
            String dataMahasiswa[][] = modeldaftar.readDaftar();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewdaftar.btndaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = viewdaftar.getUser();
                String pass = viewdaftar.getPass();
                modeldaftar.insertDaftar(user, pass);

                String dataDaftar[][] = modeldaftar.readDaftar();
            }
            
        });
        
        viewdaftar.btnbatal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewdaftar.setVisible(false);
                new MVC_Login();
            }
            
        });
        
        viewdaftar.btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    viewdaftar.setVisible(false);
                    System.exit(0);
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }

            }
           
        
        });
    }
}
