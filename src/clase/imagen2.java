/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import static java.lang.Thread.sleep;
import java.util.Random;
import javax.swing.JLabel;

public class imagen2 extends Thread{
    int aleatorio;
    
    javax.swing.JLabel imagen1;
    
    public void run() {
        Random azar = new Random();
        
        while (true) { 
            aleatorio = azar.nextInt(4);
            if (aleatorio == 0) {
                rsscalelabel.RSScaleLabel.setScaleLabel(imagen1, "src/imagenes/fresa.png");
            }
            if (aleatorio == 1) {
                rsscalelabel.RSScaleLabel.setScaleLabel(imagen1, "src/imagenes/moneda.png");
            }
            if (aleatorio == 2) {
                rsscalelabel.RSScaleLabel.setScaleLabel(imagen1, "src/imagenes/esmeralda.png");
            }
            if (aleatorio == 3) {
                rsscalelabel.RSScaleLabel.setScaleLabel(imagen1, "src/imagenes/calavera.png");
            }  
        try {
            sleep(1000);
        } catch (Exception e) {
        }    
        }
    }
    
    public void setImagen2(JLabel imagen1) {
        this.imagen1 = imagen1;
    }

    public int getAleatorio() {
        return aleatorio;
    }
    
}
