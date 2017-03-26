package Executavel;

import Facade.ContaCorrente;
import Facade.Investimento;
import Facade.BancoFacade;
import Facade.Emprestimo;

/**
 *
 * @author tunnes
 *
 * Facade
 * 
 * O padrão de projetos Facade (Fachada) tem como objetivo o que seu nome já diz... ele cria uma fachada para 
 * o cliente, em termos técnicos este padrão cria uma interface simplificada para processos complexos. Como 
 * exemplo temos uma simulação de um sistema bancario, onde para se efetuar um procedimento da regra de negocios 
 * é necessario a execução de diversos métodos utilizando o padrão Facede podemos agrupar estes métodos por 
 * procedimento e assim apenas passar a instância dos objetos relacionados a fachada embora sua finalidade seja 
 * esta, uma fachada tambem pode connter atributos e métodos proprios.
 * 
 * UML: http://videos.web-03.net/artigos/Higor_Medeiros/PadraoFacade_Java/PadraoFacade_Java1.jpg
 * 
 */

public class Main {
    
    public static void main(String[] args) {
        BancoFacade bf = new BancoFacade(new Investimento(), new ContaCorrente(), new Emprestimo());
        bf.pedirEmprestimo();
        bf.investir();
    }
    
}
