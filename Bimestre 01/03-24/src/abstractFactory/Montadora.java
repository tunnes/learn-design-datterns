package abstractFactory;

/**
 * 
 * @author tunnes
 * 
 * Fabrica Concreta
 * 
 * Dentro desta Enum "Montadora" temos as facricas concretas "Honda" e "BMW" como pode ser notado cada uma 
 * possui dois metodos geradores de novas instâncias filhas da classe abstrata "Carro" e "Moto", não é 
 * obrigatório a utilização de uma Enum, podem no exemplo abaixo é possivel notar que desta maneira é muito 
 * mais elegante e reduz consideravelmente o número de linhas codificadas, além de fazer mas sentido do que 
 * usar uma estrutura condicional para a chamada de seus métodos.
 * 
 * Obs: Na situação abaixo as informações enviadas como paramêtro viriam de um classe "Model" e de um acesso
 *      ao banco de dados para enfim ser instânciado o produto, mas ainda não foi implementado este procedimento.
 * 
 */
public enum Montadora {
    HONDA {
        @Override
        public Carro criarCarro(){
            return new Civic("New", 78.000, 2018);
        }
        @Override
        public Moto criarMoto(){
            return new Bros("NXR 150", 8.000, 2008);
        }
    },
    BMW {
        @Override
        public Carro criarCarro(){
            return new I8("Spyder", 799.950, 2018);
        }
        @Override
        public Moto criarMoto(){
            return new F800("800cc", 51.000, 2018);
        }
        
    };
    
    public abstract Carro criarCarro();
    public abstract Moto criarMoto();
}
