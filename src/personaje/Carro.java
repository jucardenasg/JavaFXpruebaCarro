/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

/**
 *
 * @author Estudiante
 */
public class Carro {
     private int x;
     private int y;

    public Carro(int x, int y) {
        this.x = x;
        this.y = y;
    }
     
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void mover(){
        this.x++; //muevo el carro en una posicin de x cada segundo
    }
     
     
}
