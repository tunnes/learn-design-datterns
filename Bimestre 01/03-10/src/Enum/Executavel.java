package Enum;

/**
 *
 * @author tunnes
 * 
 * No java existe um tipo de classe chamada "Enum" ela não necessita ser instânciada,
 * o que facilita seu manuseio, como uma classe ela pode conter atributos e esses 
 * atributos podem conter os métodos de sua Enum como pode ser notado na Enum "Animal"
 * que possui "CACHORRO", que por sua vês possui o método emitir som.
 * 
 */
public class Executavel {
    public static void main(String[] args){
    
        Dia d = Dia.SEXTA;
        Agenda a = new Agenda("Eu", d);
        a.verAgenda();
        
        Curso c = Curso.SI;
        System.out.println( c.getNome() );
        a.verAgenda();
        
        Animal dog = Animal.CACHORRO;
        dog.emitirSom();
 
    }
    
}
