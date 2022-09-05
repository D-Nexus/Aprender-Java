//Metodo "length" y "substring"
import java.util.Scanner;

public class clase_18 {
  public static void main(String[] args){
    //Entradas
    Scanner entrada = new Scanner(System.in);
    String cadena_original = "", cadena_sub = "";
    int num_caracteres = 0, desde = 0, hasta = 0;
    //Proceso
    System.out.print("Introduce una cadena de caracteres: ");
    cadena_original = entrada.nextLine();

    //Metodo "Length" para contar la longitud que tiene cadena_original
    num_caracteres = cadena_original.length();
    //Imprimir la cantidad de caracteres que tiene cadena_original
    System.out.println("La cadena de caracteres " + cadena_original + " tiene " + num_caracteres + " caracteres");
    //Obtener nueva cadena a partir de cadena_original
    System.out.print("¿Desde que caracter deseas obtener la nueva cadena?: ");
    desde = entrada.nextInt();
    System.out.print("¿Hasta que caracter deseas obtener la nueva cadena?: ");
    hasta = entrada.nextInt();
    //Guardar la nueva cadena de caracteres con los parametros ingresados
    cadena_sub = cadena_original.substring(desde,hasta);
    System.out.println("La nueva cadena es: " + cadena_sub);

    entrada.close();
  }
}
