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
public class Executavel {

    /**
        * @param args the command line arguments
    
    
    public static void main(String[] args) {;
        AgregadoDeCanais canaisDeEsportes = new CanaisEsportes();
        System.out.println("Canais de Esporte:");
        for (IteradorInterface it = canaisDeEsportes.criarIterator(); !it.isDone(); it.next()) {
            System.out.println(it.currentItem().mostrarNome());
        }
        
        AgregadoDeCanais canaisInfantis = new CanaisInfantis();
        System.out.println("\nCanais de Filmes:");
        for (IteradorInterface it = canaisInfantis.criarIterator(); !it.isDone(); it.next()) {
            System.out.println(it.currentItem().mostrarNome());
        }
    }
    */
}
