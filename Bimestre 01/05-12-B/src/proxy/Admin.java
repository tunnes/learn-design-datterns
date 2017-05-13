/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

/**
 *
 * @author lab5
 */
public class Admin implements Acesso{
    Admin() {}
    
    @Override
    public void admin() {
        System.out.println("Acesso administrador");
    }

    @Override
    public void index() {
        System.out.println("Acesso usuario");
    }
    
}
