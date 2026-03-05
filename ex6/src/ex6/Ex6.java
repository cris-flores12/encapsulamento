/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author crisf
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Usuário u = new Usuário("admin", "1234");

        if (u.autenticar("admin", "1234")) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Login ou senha incorretos");
        }

    }
    
}
