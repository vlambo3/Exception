/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ej.pkg4;

/**
 *
 * @author Vanina
 */
public class ExcepcionesEj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego game = new Juego();
        
        game.ronda();
        System.out.println("Felicidades acertaste!");
        System.out.println("Cantidad de intentos " + game.getCont());
    }
    
}
