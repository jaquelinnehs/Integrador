package integrador;

import java.util.Scanner;

public class Integrador {
    
public static void main(String[] args) {
                
        Scanner d= new Scanner(System.in);
        String valor;
       
        System.out.println(" De acuerdo  a la ecuacion (b**2-4*a*c) ");
        System.out.println(" Dame el valor para a: ");
        valor=d.next();
        Double a= Double.valueOf(valor);
        
        System.out.println(" Dame el valor para b: ");
        valor=d.next();
        Double b= Double.valueOf(valor);
        System.out.println(" Dame el valor para c: ");
        valor=d.next();
        Double c= Double.valueOf(valor);
        
        double R = (float) Math.pow(b, 2)-4*a*c;
        
        if (R>0)
        {
          if(R==0)
          {  
                System.out.println(" Las raices son numeros reales iguales ");
                
                float X1= (float) (-b + Math.sqrt(R)/2*a);
                
                System.out.println(" El resultado de X1 es: " + X1);
                System.out.println(" El resultado de X2 es: " + X1);
          }
          else
          {
                System.out.println(" Las raices son numeros reales diferentes ");
                float X1= (float) (-b + Math.sqrt(R)/2*a);
                float X2= (float) (-b - Math.sqrt(R)/2*a);
                
                System.out.println(" El resultado de X1 es: " + X1);
                System.out.println(" El resultado de X2 es: " + X2);   
          }
        
        }
        else
        {
            System.out.println(" La solucion se encuentra en los numeros complejos ");
        }    
    }
}
