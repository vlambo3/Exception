/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ej.pkg4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class Juego {
    
    private final Integer num;
    private Integer cont;

    public Integer getCont() {
        return cont;
    } 
            
    public Juego() {
        num = (int) (Math.random()*500-1);
        cont = 0;        
    }
        
    
    public void ronda() {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese un nro");
            int numeroUsuario = sc.nextInt();
            cont ++;
            
            if (numeroUsuario != num) {
                if (numeroUsuario > num) {
                    System.out.println("El numero ingresado es mayor");
                } else  {
                    System.out.println("El numero ingresado es menor");
                }                
                ronda();
            }
        } catch (InputMismatchException e) { //por si ingresa un dato q no sea un nro
            System.out.println("Ingresó un dato incorrecto");
            cont++;
            ronda();
        } 
        //NO LO HICIMOS ASÍ PORQUE POR LA RECURSIVIDAD NOS MOSTRABA TANTAS VECES EL MSJ COMO INTENTOS   
//        finally {
//            System.out.println("Felicidades, acertaste!");
//            System.out.println("Cantidad de intentos " + cont);
        }   
        
    }
    
   
    

