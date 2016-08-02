/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figtrigonometricas;

import java.util.Scanner;

/**
 *
 * @author Toshiba
 */
public class areafig {
    
    public static void main(String[] args) {
        int opc;
        Figtrigonometricas figtrigo =new Figtrigonometricas();
        do {  
            Scanner lector = new Scanner(System.in);
            System.out.println("Digite la opcion de la figura que quiere el area ");
            System.out.println("1. triangulo");
            System.out.println("2. circulo");
            System.out.println("3. rectangulo");
            System.out.println("4. cuadrado");
            opc = lector.nextInt();
            switch (opc){
                case 1:
                    figtrigo.triangulo();
                    break;
                case 2:
                    figtrigo.circulo();
                    break;
                case 3:
                    figtrigo.rectangulo();
                    break;
                case 4:
                    figtrigo.cuadrado();
                    break;
            }
        } while (opc!=0);
    }
}
