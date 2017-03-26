package Exercicio;

/**
 *
 * @author tunnes
 */
public enum Cartao {
    SILVER(50, 0), GOLD(100, 2), PLATINUM(150, 10),BLACK(300, 20);
    
    private final int anuidade;
    private final int desconto;
    
    private Cartao(int anuidade, int desconto){
        this.anuidade = anuidade;
        this.desconto = desconto;
    }
    public int getAnuidade(){
        return this.anuidade;
    }
    public int getDesconto(){
        return this.desconto;
    }
}
