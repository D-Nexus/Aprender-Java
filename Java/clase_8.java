//Ejemplo de una operación matematica con datos ingresados por usuario
import java.util.Scanner; //Nos permite introducir datos desde teclado hacia el programa

public class clase_8 {
  public static void main(String[] args){
    
    Scanner entrada = new Scanner(System.in); //Declaramos una variable de tipo "Scanner" con "System.in" para indicar entrada de datos
    String nombre = ""; //Variable de tipo String
    int numUno = 0, numDos = 0, resultado = 0; //Podemos declarar todas las variables del mismo tipo en una linea

    System.out.println("¿Cual es tu nombre?");
    nombre = entrada.nextLine();

    System.out.println("Dame el primer valor para tu suma:");
    numUno = entrada.nextInt();
    System.out.println("Dame el segundo valor para tu suma:");
    numDos = entrada.nextInt();

    resultado = numUno + numDos;
    entrada.close();

    System.out.println("Hola " + nombre + " el resultado de tu suma es: " + resultado);
    
    /*No poner println al solicitar un dato si se quiere escribir 
    de la siguiente forma.

    System.out.print("Ingrese su nombre")
    Ingrese su nombre: jorge

    System.out.println("Ingrese su nombre")
    Ingrese su nombre:
    jorge 
    
    */
  }
}
