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
public class Proxy implements InterLogin<String> {
    private String email;
    private String senha;
    private Login realLogin = null;

    public Proxy(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    
    private Login createRealLogin(){
        return new Login(this.email, this.senha);
    }

    @Override
    public String display() {
        if(this.realLogin == null){
            this.realLogin = this.createRealLogin();
        }
        
        return this.realLogin.display();
    }
    
}
