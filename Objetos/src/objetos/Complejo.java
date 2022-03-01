/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author usuario
 */
public class Complejo implements Cloneable {
    private int parteReal;
    private int parteImaginaria;
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj;
        obj = super.clone();
        return obj;
    }

    public Complejo () {
    }

    public void setParteReal(int parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteImaginaria(int parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public int getParteReal() {
        return parteReal;
    }

    public int getParteImaginaria() {
        return parteImaginaria;
    }
    
    @Override
    public String toString() {
        return "la parte real es: " + getParteReal() + ". La parte imaginaria es: " + getParteImaginaria() + ".";
    }
    
}
