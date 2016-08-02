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
public class Figtrigonometricas {
double base,altura,lado,radio,area;
Scanner lector = new Scanner(System.in);

public void triangulo(){
    Scanner lector = new Scanner(System.in);
    System.out.println("digite su base, altura");  
    base = lector.nextDouble();
    altura = lector.nextDouble();
    area = (base*altura)/2;
    System.out.println("area= "+area);
    area = 0;
    base = 0;
    altura = 0;
}
public void circulo(){
    Scanner lector = new Scanner(System.in);
    System.out.println("digite su radio");
    radio = lector.nextDouble();
    area = (Math.PI)*(Math.pow(radio, 2));
    System.out.println("area= "+area);
    area = 0;
}
public void cuadrado(){
    Scanner lector = new Scanner(System.in);
    System.out.println("digite su lado");
    lado = lector.nextDouble();
    area = Math.pow(lado, 2);
    System.out.println("area= "+area);
    area = 0;
}
public void rectangulo(){
    Scanner lector = new Scanner(System.in);
    System.out.println("digite su base, altura");
    base = lector.nextDouble();
    altura = lector.nextDouble();  
    area = base * altura;
    System.out.println("area= "+area);
    area = 0;
    base = 0;
    altura = 0;
}
}
