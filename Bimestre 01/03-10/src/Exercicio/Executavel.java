package Exercicio;

/**
 * 
 * @author tunnes
 * 
 * Exercicio
 * 
 * Crie uma ENUM cartão que possui os contrutores SILVER, GOLD, PLATINUM E BLACK. 
 * Cada uma delas indica um valor de anuidade sendo R$50,00 para a SILVER, R$100,00 para GOLD
 * R$150,00 para PLATINUM e R$300,00 para BLACK. Essa ENUM também possui um sistema para dar 
 * descontros anuais na fatura. SILVER não possui desconto, GOLD 2%, PLATINUM 10% e BLACK 20%.
 * 
 * Faca uma classe fatura que possua como atributos, nome, valor da fatura e cartão. 
 * Implemente o método descontro() Que realiza o desconto conforme acima e o método 
 * cobrarAnuidade() Que adiciona a anuidade a fatura conforme acima.
 * 
 */

public class Executavel {
    public static void main(String[] args){
    //  Instância do cartão SILVER:
        Cartao a = Cartao.SILVER;
        Fatura b = new Fatura(a, "Ayrton", 100);
               b.desconto();
               b.cobrarAnuidade();

    //  Instância do cartão GOLD:
        Cartao c = Cartao.GOLD;
        Fatura d = new Fatura(c, "Felipe", 100);
               d.desconto();
               d.cobrarAnuidade();

    //  Instância do cartão PLATINUM:
        Cartao e = Cartao.PLATINUM;
        Fatura f = new Fatura(e, "Souza", 100);  
               f.desconto();
               f.cobrarAnuidade();

    //  Instância do cartão BLACK:
        Cartao g = Cartao.BLACK;
        Fatura h = new Fatura(g, "Tunes", 100);
               h.desconto();
               h.cobrarAnuidade();            
    }
}
