/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    
    private GraphicsContext gc; //si no reconoce lo que debe borra, no hara el movimiento, por eso se implementa esto
    private Carro carro;
    
    public LoopJuego(GraphicsContext gc){
        this.gc = gc;
        this.carro = new Carro(0,200);
    }
   
    @Override
    public void handle(long l) {
        //cada vez que haga un ciclo, siempre va a entras aqui
        gc.clearRect(0, 0, 300, 300);//borrando el tablero
        gc.fillRect(this.carro.getX(),this.carro.getY(), 20, 20);//dibujando el tablero
        
        this.carro.mover();//implemento el metodo de mover el carro
    }
}
