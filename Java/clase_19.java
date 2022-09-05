//Agregar elementos a un Array y metodo toString()
import java.util.Scanner; //Permite el ingreso de datos desde el teclado
import java.util.Arrays; //Permite usar el metodo toString()

public class clase_19 {
  public static void main(String[] args){
    Scanner entrada = new Scanner(System.in);
    int numeros[] = new int[5]; //Array que tiene 5 posiciones para guardar datos.
    int x = 0, indice = 0, num = 0;

    while(x < 5){ //Ciclo para ingresar cada una de las 5 posiciones en el Array.
      System.out.print("Ingrese un numero: ");
      num = entrada.nextInt();
      numeros[indice]=num; //Ingresa "num" en la posición "indice" dentro del Array "numeros".
      System.out.println("El numero agregado es: " + num + " en la posición " + indice);
      indice++;
      x++;
    }
    //toString() metodo para imprimir un array en java.
    System.out.println(Arrays.toString(numeros));

    entrada.close();
  }
}
