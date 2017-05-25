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
public class Proxy implements Acesso{
    private Acesso a;
    public Proxy(String login, String senha){
        a = "root".equals(login) && "root".equals(senha) ? new Admin() : new Visitante();
    }
    @Override
    public void admin() {
        a.admin();
    }

    @Override
    public void index() {
        a.index();
    }
    
}
