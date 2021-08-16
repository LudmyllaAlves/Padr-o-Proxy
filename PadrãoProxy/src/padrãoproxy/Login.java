/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrãoproxy;

/**
 *
 * @author tatia
 */
public class Login implements InterLogin<String>{
    private String email;
    private String senha;

    public Login(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

   @Override
    public String display() {
        return "Login: " + this.email;
    }
    
}
