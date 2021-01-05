/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Daftar;


/**
 *
 * @author DELL
 */
public class MVC_Daftar {
    ViewDaftar vd = new ViewDaftar();
    ModelDaftar md = new ModelDaftar();
    ControllerDaftar cd = new ControllerDaftar(vd, md);
    
}
