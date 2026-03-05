/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodex2;

/**
 *
 * @author crisf
 */
public class produto {
     private String nome;
    private double preço;

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getpreço() {
    return preço;
    }
public void setpreço( double preço) {
        this.preço=preço;
    }

}
