/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author tunnes
 */
public class Canal {
    private String nome;
    private String numero;
    private String imagem;    
    
    public Canal(String nome, String numero, String imagem){
        this.nome = nome;
        this.numero = numero;
        this.imagem = imagem;
    }
    
    public String mostrarNome(){
        return this.nome;
    }
    
    public String mostrarNumero(){
        return this.numero;
    }
    
    public String mostrarImagem(){
        return this.imagem;
    }    
}
