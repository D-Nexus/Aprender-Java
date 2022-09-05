//Comparación de variables String
//Simulación de un inicio de sesión
import java.util.Scanner;

public class clase_17 {
  public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    String nombre1 = "jorge", nombre2 = "", clave1 = "jorge1234", clave2 = "";

    //Entradas
    System.out.println("¡¡Bienvenido!!");
    System.out.println("Ingrese su nombre:");
    nombre2 = entrada.nextLine();
    System.out.println("Ingrese su clave:");
    clave2 = entrada.nextLine();
    //Proceso
    if(nombre2.equals(nombre1) && clave2.equals(clave1)){
      System.out.println("Inicio de sesion correcto");
    }else{
      System.out.println("Inicio de sesion incorrecto");
    }
    entrada.close();
  }
}
