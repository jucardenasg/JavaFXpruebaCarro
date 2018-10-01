/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrofx;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int x;
    private int y;
    private Llanta[] llantas;
    private Chasis chasis;
    
    public Carro(int x, int y) {
        this.x = x;
        this.y = y;
        this.llantas = new Llanta[2];
        //incicializar llantas tomando como referencia xy del carro
        this.llantas[0] = new Llanta(x,y);
        this.llantas[1] = new Llanta(x,y);
        //incicializar chasis del carro
        this.chasis = new Chasis(x,y);
        
        
    }
/**
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Llanta[] getLlantas() {
        return llantas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
   **/ 
}
