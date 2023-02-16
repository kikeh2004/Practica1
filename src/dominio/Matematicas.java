package mates;
import java.util.*;
public class Matematicas{
 public static void Main(String [] args){
    Scanner sc = new Scanner(System.in);
    long puntos = sc.nextInt();
    long acierto = 0;
    Random random = new Random();

    for (int i=0; i<puntos; i++){
        double x = random.nextDouble();
        double y = random.nextDouble();
        
        if (y*y + x*x <= 1){
            acierto++;
        }
    }
    
    double piAproximado = 4 * acierto / puntos;
    
    System.out.println("El numero Pi aproximado es " + piAproximado);
}
}