/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author lab2
 */
public class PagamentoCartaoCredito implements PagamentoCommand{
    @Override
    public void processarCompra(Compra compra) {
        System.out.println("Pago no cartão de crédito! \n" + compra.getInfoNota());
    } 
}
