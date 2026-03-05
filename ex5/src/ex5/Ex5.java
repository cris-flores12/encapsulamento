/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author crisf
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Funcionario f = new Funcionario();

        f.setNome("Da vinci");
        f.setSalario(12000.00);

        System.out.println("Nome: " + f.getNome());
        System.out.println("Salário: " + f.getSalario());
    }

    }
