/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public class Educacao extends Portal{
        
//  SubjectState
    private String noticiasEducacao;
    
    @Override
    public void setState(String noticiasEducacao){
        this.noticiasEducacao = noticiasEducacao;
        super.notificar();
    }
    
    @Override
    public String getState(){
        return this.noticiasEducacao;
    }
}
