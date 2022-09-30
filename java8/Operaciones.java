package java8;
import java.util.Scanner;

public class Operaciones {
   
    public static void main (String args[]){
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Digita por favor el primer numero ");
    Integer num1 = teclado.nextInt();
    System.out.println("Digita porfavor el segundo numero ");
    Integer num2= teclado.nextInt();
    System.out.println("Que operacion desea realizr 1-SUMA 2-RESTA 3-MULTIPLICACION 4-DIVISION");
    Integer parametro  = teclado.nextInt();
    Integer resultado = 0;

    
    switch(parametro){
        case 1: resultado = num1 + num2 ;
        System.out.println("El resultado de la suma es " + resultado);
        break;
        case 2: resultado = num1 - num2 ;
        System.out.println("El resultado de la resta es " + resultado);
        break;
        case 3 :resultado = num1 * num2 ;
        System.out.println("El resultado de la multiplicacion es " + resultado);
        break;
        case 4:resultado = num1 / num2 ;
        System.out.println("El resultado de la division es " + resultado);
        break;
        default:
        System.out.println("ERROR no aplica el numero que estas digitando");
    }
    
    teclado.close();
   } 
}
