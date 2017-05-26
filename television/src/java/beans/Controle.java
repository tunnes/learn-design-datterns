package beans;

import iterator.AgregadoDeCanais;
import iterator.CanaisEducativos;
import iterator.CanaisEsportes;
import iterator.CanaisInfantis;
import iterator.CanaisSeries;
import iterator.IteradorInterface;
import java.io.Serializable;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;

@Named(value = "controle")
@SessionScoped
public class Controle implements Serializable{
    
    private IteradorInterface iterador;
    
    public Controle(){
        mudarGenero(new CanaisEsportes());
    }
    private void mudarGenero(AgregadoDeCanais novoGenero){
        this.iterador = novoGenero.criarIterator();        
    }
    
    public void canaisEducativos(){
        mudarGenero(new CanaisEducativos());
    }
    
    public void canaisEsportivos(){
        mudarGenero(new CanaisEsportes());
    }
    
    public String canaisInfantis(){
        mudarGenero(new CanaisInfantis());
        return null;
    }
    public String canaisSeries(){
        mudarGenero(new CanaisSeries());
        return null;
    }      
    public String nomeCanal() {
        return iterador.currentItem().mostrarNome();        
    }
    public String numeroCanal() {
        return iterador.currentItem().mostrarNumero();
    }    
    public String imagemCanal() {
        return  iterador.currentItem().mostrarImagem();
    }  
    
    public void avancar() {
        if(!iterador.isDone()){
            iterador.next();
        }
    }
    public void retornar() {
        iterador.prev();
    }
    
}
