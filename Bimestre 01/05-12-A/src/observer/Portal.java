/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;

public abstract class Portal {
    
//  Estado
    private ArrayList<Veiculo> obs;
    
    public Portal(){
        obs = new ArrayList<Veiculo>();
    }
    public abstract String getState();
    
    public abstract void setState(String state);
    
    public void acessar(Veiculo v){
        obs.add(v);
    }
    
    public void sair(Veiculo v){
        obs.remove(v);
    }
    
    public void notificar(){
        obs.forEach((veiculoInscrito) -> { veiculoInscrito.update(this); });
    }
    

}
