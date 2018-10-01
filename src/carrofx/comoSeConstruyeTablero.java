package carrofx;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class comoSeConstruyeTablero extends Application {
   
    @Override
    public void start(Stage stage) throws Exception{
        //Layout
        Pane panel= new Pane();
        Canvas canvas = new Canvas(300,300);
        panel.getChildren().add(canvas);
       
        Scene scene = new Scene(panel,300,300,Color.WHITESMOKE);//CREE UNA ESCENA, Y EN ESA ESCENA PONGA EL CANVAS. COLOR.ALGO ES EL COLOR DEL FONDO DE LA ESCENA
           
        GraphicsContext gc = canvas.getGraphicsContext2D();  //el lapiz con el que dibujare. Referencia para dibujar con el lapiz

        gc.fillRect(10,10,20,20); //dibujar un rectangulo. tiene 4 parametros(x,y,ancho,alto)
        gc.setFill(Color.RED); //El color
        
        //Color color = new Color(50,40,20,0);//color en rgb#
        gc.strokeLine(15, 15, 40, 40);// x inicial, y ///, x final, y ///

        gc.setFill(Color.BLUE);
        gc.fillOval(30,30,50,50);//dibujar un circulo. tiene 4 parametros(x,y,radioanchp,radi0a)       
        
        double xpoints[] ={10,30,20,10};//La ultima coordenada es la misma que la primera para que cierre el triangulo
        double ypoints[] ={10,30,15,10};//
        gc.strokePolygon(xpoints,ypoints, xpoints.length);//ultimo es cuantos puntos se van a dibujar
        gc.strokeRect(30, 30, 15, 15);
        
        
        
        stage.setTitle("Ejemplo Canvas"); //El titulo que aparecera en la escena    
        stage.setScene(scene);//Que ponga esta escena como escena inicial      
        stage.show();//que la muestre
      
        
    }
    //lanzo la app
        public static void main(String[]args){
            Application.launch(args);
        }
    }

