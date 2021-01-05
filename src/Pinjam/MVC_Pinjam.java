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

/**
 *
 * @author DELL
 */
public class MVC_Pinjam {
    ViewPinjam vp = new ViewPinjam();
    ModelPinjam mp = new ModelPinjam();
    ControllerPinjam cl = new ControllerPinjam(vp, mp);
    
}
