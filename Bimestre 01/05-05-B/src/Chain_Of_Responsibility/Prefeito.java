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
public class Prefeito extends Politico{
        
    public Prefeito(String n){
        super(n);
    }
    
    @Override
    public void aprovar(Verba verba){
        System.out.println(verba.getNome() + " Aprovada! PELO PREFEITO");
    }
        
}
