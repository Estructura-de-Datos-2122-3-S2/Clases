/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephonequeues;


public class Cliente {
    private int id;
    private Regalo regalo;

    public Cliente(int id) {
        this.id = id;
        this.regalo = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Regalo getRegalo() {
        return regalo;
    }

    public void setRegalo(Regalo regalo) {
        this.regalo = regalo;
    }
    
    
    
}
