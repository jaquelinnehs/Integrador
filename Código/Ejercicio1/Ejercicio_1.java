package com.mycompany.experimenta;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        double x1, y1, x2, y2, m, b, x, y0, x3;
        Scanner va = new Scanner(System.in);
        String di;
        System.out.println("Ingrese valor de x1");
        di=va.next();
        x1= Double.parseDouble(di);
        
        System.out.println("Ingrese valor de y1");
        di=va.next();
        y1= Double.parseDouble(di);
        
        System.out.println("Ingrese valor de x2");
        di=va.next();
        x2= Double.parseDouble(di);
        
        System.out.println("Ingrese valor de y2");
        di=va.next();
        y2= Double.parseDouble(di);
        
        m = (y2 - y1) / (x2 - x1);
        
        if (m < 0) {
            System.out.println("La pendiente es decreciente");
        } else {
            System.out.println("La pendiente es creciente");
        }
        
        System.out.println("El valor de la pendiente es: " + m);
        
        b = y1 - (m * x1);
        System.out.println("El valor del intercepto es: " + b);
        
        System.out.println("Al ingresar estos datos en la ecuación de la recta (y = mx + b) queda de la siguiente forma");
        System.out.println("y = " + m + "x + " + b);
        
        System.out.println("Ingrese un valor para x");
        di=va.next();
        x= Double.parseDouble(di);
        
        y0 = (m * x) + b;
        System.out.println("El resultado es: " + y0);
        
        x3 = Math.atan(m);
        double grados = Math.toDegrees(x3);
         if (grados > 0) {
            System.out.println("El ángulo interno es " + grados + "°");
        } else {
            grados = grados*(-1);
            System.out.println("El ángulo interno es " + grados + "°");
        }
    }
}
