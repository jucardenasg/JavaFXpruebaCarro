/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaje;

import javafx.application.Application;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application{    
    
    @Override
    public void start(Stage stage) throws Exception{
        //Layout
        Pane panel= new Pane();
        Canvas canvas = new Canvas(300,300);
        panel.getChildren().add(canvas);
       
        Scene scene = new Scene(panel,300,300,Color.WHITESMOKE);//CREE UNA ESCENA, Y EN ESA ESCENA PONGA EL CANVAS. COLOR.ALGO ES EL COLOR DEL FONDO DE LA ESCENA
           
        GraphicsContext gc = canvas.getGraphicsContext2D();  //el lapiz con el que dibujare. Referencia para dibujar con el lapiz
        
        LoopJuego loop = new LoopJuego(gc);
        loop.start();
        
        stage.setTitle("Ejemplo Canvas"); //El titulo que aparecera en la escena    
        stage.setScene(scene);//Que ponga esta escena como escena inicial      
        stage.show();//que la muestre
      
        
    }
    //lanzo la app
        public static void main(String[]args){
            Application.launch(args);
        }
    }


