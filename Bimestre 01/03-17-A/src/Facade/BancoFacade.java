package Facade;

/**
 * 
 * @author tunnes
 * 
 */

public class BancoFacade {
    private final ContaCorrente contaCorrente;
    private final Investimento investimento;
    private final Emprestimo emprestimo;

    public BancoFacade(Investimento investimento, ContaCorrente contaCorrente, Emprestimo Emprestimo) {
        this.contaCorrente = contaCorrente;
        this.investimento = investimento;
        this.emprestimo = Emprestimo;
    }

    public void pedirEmprestimo() {
        contaCorrente.checarSaldo();
        emprestimo.verificarRenda();
        emprestimo.emprestar();
        contaCorrente.atualizarSaldo();
    }

    public void investir() {
        contaCorrente.checarSaldo();
        contaCorrente.verificarLimite();
        investimento.receber();
        investimento.incidirJuros();
    }
}
