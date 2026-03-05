/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcioex1;

/**
 *
 * @author crisf
 */
public class funcionario {
    private String nome;
    private double salario;
    public String getnome(){
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public double getsalario(){
        return salario;
    }
   public void setsalario( double salario) {
          if (salario >= 0) {
            this.salario = salario;
        } else {
              System.out.println("pagamento inválido!");
    }
    
    
}
}