/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contbancex3;

/**
 *
 * @author crisf
 */
public class contabancaria {
    public String titular;
    private double saldo;
    public void setSaldo(double saldo){
        if(saldo>0){
            this.saldo=saldo;
        }else{
            System.out.println("saldo inválido");
        }
    }
        public double getSaldo(){
            System.out.println(saldo);
            return saldo;
        }
        public void sacar(double valor){
            if(valor<=saldo){
                saldo -= valor;
                
            }else{
                System.out.println("saldo insuficiente");
            }
            
        }
        public void depositar(double valor){
                if(valor>0){
                    saldo+=valor;
                }else{
                    System.out.println("valor inválido");
                }
            }
}
