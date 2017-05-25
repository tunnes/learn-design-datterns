/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

public class Executavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //  TODO code application logic here
    
    //  Subjects Singleton: 
        Esportes es = new Esportes();
        Educacao ed = new Educacao();
    
    //  Observers:
        Sitio s = new Sitio();
        Mobile m = new Mobile();
        
        es.acessar(s);
        es.acessar(m);
        ed.acessar(s);
        ed.acessar(m);
        
        es.setState("Corinthians campeão Paulista 2017.");
        ed.setState("Curso de youtubber abre na Fatec.");  
    }
}
