/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ej.pkg2;

/**
 *
 * @author Vanina
 */
public class ExcepcionesEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] array = new String[3];
        try {
            for (int i = 0; i < 10; i++) {
                array[i] = "a";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println("el array se pasó de indice");
        }
    }
    
}
