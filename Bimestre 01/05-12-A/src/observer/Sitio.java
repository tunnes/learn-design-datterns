/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public class Sitio implements Veiculo{

    @Override
    public void update(Portal p) {
        System.out.println("Sitio do portal informa: ");
        System.out.println(p.getState());        
    }
}
