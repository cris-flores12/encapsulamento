/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

/**
 *
 * @author crisf
 */
public class Pessoa {
      protected int idade;

}

class Aluno extends Pessoa {

    public void definirIdade(int idade) {
        this.idade = idade;
    }

    public void mostrarIdade() {
        System.out.println("Idade do aluno: " + idade);
    }

}
