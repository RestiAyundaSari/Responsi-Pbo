/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author DELL
 */
public class MVC_Login {
    ViewLogin vl = new ViewLogin();
    ModelLogin ml = new ModelLogin();
    ControllerLogin cl = new ControllerLogin(vl, ml);
}
