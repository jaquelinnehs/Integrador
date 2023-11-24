package integrador;
import java.util.Scanner;

/**
 *
 * @author jaque
 */

public class Integrador {
    
public static void main(String[] args) {
                
        Scanner d= new Scanner(System.in);
        String valor;
       
        System.out.println(" De acuerdo  a la ecuacion (b**2-4*a*c) ");
        System.out.println(" Dame el valor para a: ");
        valor=d.next();
        Double a= Double.parseDouble(valor);
                
        System.out.println(" Dame el valor para b: ");
        valor=d.next();
        Double b= Double.parseDouble(valor);
        System.out.println(" Dame el valor para c: ");
        valor=d.next();
        Double c= Double.parseDouble(valor);

        
        Double D = (float)(Math.pow(b, 2))-4*a*c;
        
        if (D>0)
        {
          
                float X1= (float) ((-b + Math.sqrt(D))/(2*a));
                float X2= (float) ((-b -Math.sqrt(D))/(2*a));
                System.out.println(" El resultado de X1 es: " + X1);
                System.out.println(" El resultado de X2 es: " + X2);   
                System.out.println(" Las raices son numeros reales diferentes ");
              
        }
        else
        {
            if(D==0)
            {
                float X1= (float)(-b /(2 * a));
                float X2=X1;
                System.out.println(" El resultado de X1 es: " + X1);
                System.out.println(" El resultado de X2 es: " + X2);
                System.out.println(" Las raices son numeros reales iguales ");

            }
        else
        {
            System.out.println(" La solucion se encuentra en el conjunto de numeros complejos ");
        }       
        }
       
    }
}
