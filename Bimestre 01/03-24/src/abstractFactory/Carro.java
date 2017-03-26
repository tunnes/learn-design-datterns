package abstractFactory;

/**
 * 
 * @author tunnes
 * 
 */
public abstract class Carro {
    private final String modelo;
    private final double preco;
    private final int ano;
    
    Carro(String modelo, double preco, int ano){
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public int getAno(){
        return this.ano;
    }
}
