package Executavel;

import Adapter.PatoAdapter;
import Adapter.PatoBranco;
import Adapter.PatoVerde;
import Adapter.Pato;
import Adapter.Peru;

/**
 *
 * @author tunnes
 * 
 * Adapter
 * 
 * O padrão de projetos "Adapter" é muito utilizado para adaptar uma classe a procedimentos relacioados a outra classe, como 
 * o proprio nome diz é um adaptador, ou seja uma classe adaptadora que é implementada apartir da interface com a qual se 
 * deseja trabalhar, para exemplificar temos uma interface "Pato" e diversos "Patos" implementados a partir dela porém no 
 * meio desse sistema temos uma classe "Peru" é necessaria e não foi implementada a partir de uma interface "Pato", então 
 * ela deve ser adaptada ou seja seus métodos terão que ser compativeis com a interface "Pato".
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        
        Pato patoBranco = new PatoBranco();
        patoBranco.grasnar();
        patoBranco.voar();
        
        Pato patoVerde = new PatoVerde();
        patoVerde.grasnar();
        patoVerde.voar();
        
    //  Objeto que deve ser adaptado:
        Peru peruIntruso = new Peru();
        
    //  Utilização da classe Adaptadora (Adapter):    
        Pato peruAdaptado = new PatoAdapter(peruIntruso);
        peruAdaptado.grasnar();
        peruAdaptado.voar();
    }
    
}
