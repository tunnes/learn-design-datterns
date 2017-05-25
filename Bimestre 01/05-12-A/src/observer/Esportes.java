/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author lab5
 */
public class Esportes extends Portal{
    
//  SubjectState
    private String noticiasTime;
    
    @Override
    public void setState(String noticiaTime){
        this.noticiasTime = noticiaTime;
        super.notificar();
    }
    
    @Override
    public String getState(){
        return this.noticiasTime;
    }
}
