/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author lab5
 * 
 * Padrão Decorator
 * 
 * Ele é utilizado para atribuit comportamentos em um objeto em tempo de compilação,
 * um dos padrões mais conceituados pois o mesmo utiliza quase todos os conseitos 
 * estudados em aula.
 * 
 * Utilidade:
 * https://pt.wikipedia.org/wiki/Decorator
 * https://brizeno.wordpress.com/category/padroes-de-projeto/decorator/
 * 
 */
public class Executavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //  Montando o lanche:
        Lanche LAN0 = new Hamburger(10, "Hamburger Boladão");
        Lanche AD01 = new Cheddar(5, "Cheddar Amarelo", LAN0);
        Lanche AD02 = new CebolaCrispy(15, "CebolaCripy", AD01 );
        
        System.out.println(AD02.getNome() + " por R$ " + AD02.getPreco());
    }
    
}
