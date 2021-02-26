/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial66217;

/**
 *
 * @author lampi
 */
public class Factorial66217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = 15;
        int factorial = 1;
        while (numero != 0) {
            factorial *= numero;
            numero--;
        }
        System.out.println("El Factorial de 15 es " + factorial);
    }

}
