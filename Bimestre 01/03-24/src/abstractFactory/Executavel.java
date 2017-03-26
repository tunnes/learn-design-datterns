package abstractFactory;
/**
 *
 * @author tunnes
 * 
 * Abstract Factory
 * 
 * Este padrão tem como finalidade esconder as chamadas de instâncias dos objetos, sendo possivel relacionar 
 * diversas  instâncias de maneira elegante em um único recurso (Fábrica Concreta), no exemplo abaixo apartir 
 * da Fábrica Concreta "Honda" ou "BMW" é possÍvel gerar uma instância de "Bros" ou "F800" ambas filhas da 
 * super classe Moto. Com este procedimento podemos criar uma família de objetos relacionados ou dependentes 
 * sem especificar ao certo quais são suas classes concretas, entenda alguns conceitos:
 * 
 * Fábrica Concreta: 
 * Onde você intância os objetos.
 * 
 * Objetos Relacionados ou Dependentes:
 * Herança e relacionamento de obejtos entre si.
 * 
 */
public class Executavel {
    public static void main(String[] args){
        
        Moto instanciaF8 = Montadora.BMW.criarMoto();
        System.out.println(
            "Produto: " + instanciaF8.getClass().getSuperclass().getSimpleName() + "\n"+
            "Modelo: " + instanciaF8.getModelo() + "\n"+  
            "Preco: " + instanciaF8.getPreco() + "\n" +
            "Ano: " + instanciaF8.getAno() + "\n"
        );
        
        
        
        Carro instanciaCivic = Montadora.HONDA.criarCarro();
        System.out.println(
            "Produto: " + instanciaCivic.getClass().getSuperclass().getSimpleName() + "\n"+
            "Modelo: " + instanciaCivic.getModelo() + "\n"+  
            "Preco: " + instanciaCivic.getPreco() + "\n" +
            "Ano: " + instanciaCivic.getAno() + "\n"
        );
        
    }
}
