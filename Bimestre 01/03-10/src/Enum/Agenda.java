package Enum;

/**
 *
 * @author tunnes
 */
public class Agenda {
    private String nome;
    private Dia dia;


    public Agenda(String nome, Dia dia){
        this.nome = nome;
        this.dia = dia;
    }
    public void verAgenda(){
        switch(dia){
            case DOMINGO:
            System.out.println("Futebol...");
            break;
            case SABADO:
            System.out.println("Aula...");
            break;
            case SEXTA:
            System.out.println("Maldade...");
            break;
            default:
            System.out.println("Normal...");
            break;
            
        }
    }
}
