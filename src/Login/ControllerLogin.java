/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Daftar.MVC_Daftar;
import Home.MVC_Home;
import Home.ViewHome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class ControllerLogin {
    ModelLogin modellogin;
    ViewLogin viewlogin;
    
    public ControllerLogin(ViewLogin vvl, ModelLogin vml) {
        this.viewlogin = vvl;
        this.modellogin = vml;
        
        if (modellogin.getBanyakData() != 0) {
            String dataMahasiswa[][] = modellogin.readLogin();
        } else {
            JOptionPane.showMessageDialog(null, "Data Tidak Ada");
        }
        
        viewlogin.btnlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            try {
                String sql = "SELECT * FROM accounts WHERE Username='"+viewlogin.getUser()+"' AND Password='"+viewlogin.getPass()+"'";
                ResultSet rs = modellogin.statement.executeQuery(sql);
                if(rs.next()){
                    if(viewlogin.getUser().equals(rs.getString("Username")) && viewlogin.getPass().equals(rs.getString("Password"))){
                        JOptionPane.showMessageDialog(null, "Berhasil login");
                         viewlogin.setVisible(false);
                        new MVC_Home();
                        
                    }
                }
                else if (viewlogin.getUser().equals("") && viewlogin.getPass().equals("")){
                        JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                 }
                else {
                        JOptionPane.showMessageDialog(null, "Username atau Password salah");
                }
                
                
            } catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Gagal Login");
                System.out.println(ex.getMessage());
            }
            }
        
        });
        viewlogin.btndaftar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                viewlogin.setVisible(false);
                new MVC_Daftar();
            }
        
        });
        
        viewlogin.btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 int input = JOptionPane.showConfirmDialog(null,"Apa anda ingin Logout ?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    viewlogin.setVisible(false);
                    System.exit(0);
                }
                else{
                JOptionPane.showMessageDialog(null, "Tidak Logout");
                }

            }
           
        
        });
        
        
    }

    
}
