/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chain_Of_Responsibility;

/**
 *
 * @author lab5
 */
public class Executavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Verba VRB = new Verba(12500, "Tapa Buraco");
        Vereador V1 = new Vereador("Vereador 01", 2000);
        Vereador V2 = new Vereador("Vereador 02", 2500);
        Vereador V3 = new Vereador("Vereador 03", 3000);
        Prefeito P1 = new Prefeito("Prefeito 01");
        V1.setSucessor(V2);
        V2.setSucessor(V3);
        V3.setSucessor(P1);
        V1.aprovar(VRB);
    }
    
}
