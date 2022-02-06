/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones.ej.pkg3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Vanina
 */
public class ExcepcionesEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese dos nros");
            String n1 = sc.next();
            String n2 = sc.next();
            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);

            DivisionNumero.dividir(num1, num2);

        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            System.out.println("Ingresó un dato erroneo");

        } catch (NumberFormatException e) {
            System.out.println(e.toString());
            System.out.println("Debe ingresar un número");

        } catch (ArithmeticException e) {
            System.out.println(e.toString());
            System.out.println("Debe ingresar un número");
        }

    }
}
