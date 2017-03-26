package Exercicio;

/**
 *
 * @author tunnes
 * 
 */
public class Fatura {
    private final Cartao cartao;
    private final String nome;
    private final int valor;
    
    public Fatura(Cartao c, String n, int v){
        this.cartao = c;
        this.valor = v;
        this.nome = n;
    }
    
    public void desconto(){
        System.out.println(
            this.nome + " DESCONTO: " + (this.valor - ((this.valor * this.cartao.getDesconto()) / 100))
        );
    }
    public void cobrarAnuidade(){
        System.out.println(
            this.nome + " ANUIDADE: " + (this.valor + this.cartao.getAnuidade())
        );
    }
    
}
