package Enum;

/**
 *
 * @author tunnes
 */
public enum Curso {
    SI("SISTEMAS PARA INERNET"),
    ADS("ANALISE E DEV DE SI"),
    GE("GESTÃO EMP."),
    LOG("LOGISTICA"),
    GP("GESTÃO PORTUARIA");
    
    private final String nome;
    
    private Curso(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}
