/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_Of_Responsibility;

/**
 *
 * @author lab5
 */
public abstract class Politico {
    Politico sucessor;
    private String nome;
         
    Politico(String nome){
        this.nome = nome;
    }

    public void setSucessor(Politico sucessor) {
        this.sucessor = sucessor;
    }
    
    public abstract void aprovar(Verba verba);

    public String getNome() {
        return nome;
    }
}
