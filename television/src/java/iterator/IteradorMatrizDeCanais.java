/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author tunnes
 */
public class IteradorMatrizDeCanais implements IteradorInterface {
    protected Canal[] lista;
    protected int contador;
 
    public IteradorMatrizDeCanais(Canal[] lista) {
        this.lista = lista;
    }
 
    @Override
    public void first() {
        contador = 0;
    }
 
    @Override
    public void next() {
        contador++;
    }
    
    @Override
    public void prev(){
        contador--;
    }
    
    @Override
    public boolean isDone() {
        return contador == lista.length;
    }
 
    @Override
    public Canal currentItem() {
        if (isDone()) {
            contador = lista.length - 1;
        } else if (contador < 0) {
            contador = 0;
        }
        return lista[contador];
    }
}
