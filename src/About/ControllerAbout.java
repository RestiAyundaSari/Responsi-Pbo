/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package About;

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
public class ControllerAbout {
     ViewAbout viewabout;
    
    public ControllerAbout(ViewAbout va) {
        this.viewabout = va;
        
        viewabout.jbpinjam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                new MVC_Pinjam();
                
            }
            
        });
        
        viewabout.jbtampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                new MVC_Tampil();
                
            }
            
        });
        
        viewabout.jbabout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(true);
                
            }
            
        });
                
                
        viewabout.jbhome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewabout.setVisible(false);
                new MVC_Home();
                
            }
            
        });
        
        viewabout.jblogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    viewabout.setVisible(false);
                    new MVC_Login();
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }
                
            }
            
        });
    }
    
    
}
