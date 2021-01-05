/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tampil;

import Pinjam.*;
import Home.*;
import Pinjam.*;
import Tampil.*;
import Edit.*;
import About.*;

/**
 *
 * @author DELL
 */
public class MVC_Tampil {
    ViewTampil vt = new ViewTampil ();
    ModelTampil mt = new ModelTampil();
    ViewEdit ve = new ViewEdit();
    ControllerTampil ct = new ControllerTampil(vt, mt,ve);
}
