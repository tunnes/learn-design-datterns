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
public class Vereador extends Politico{
    private double extra;
    public Vereador(String n, double e){
        super(n);
        this.extra = e;
    }
    public double getExtra(){
        return this.extra;
    }
    
    @Override
    public void aprovar(Verba verba){
        if(verba.getValor() <= 10000 + this.getExtra()){
            System.out.println(verba.getNome() + " Aprovada por: " + this.getNome());
        }else{
            this.sucessor.aprovar(verba);
        }
    }
}
