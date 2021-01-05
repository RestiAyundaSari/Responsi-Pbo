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
import Login.MVC_Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ControllerHome {
    ViewHome viewhome;
    
    public ControllerHome(ViewHome vh) {
        this.viewhome = vh;
        
        viewhome.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(false);
                new MVC_Pinjam();
                
            }
            
        });
        
        viewhome.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(false);
                new MVC_Tampil();
                
            }
            
        });
        
        viewhome.jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(false);
                new MVC_About();
                
            }
            
        });
                
                
        viewhome.jbhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewhome.setVisible(true);
                
            }
            
        });
        
        viewhome.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    viewhome.setVisible(false);
                    new MVC_Login();
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }
                
            }
            
        });
    }
    
}
