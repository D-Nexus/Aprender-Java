//Ciclos anidados estructura if - else if - else
import java.util.Scanner;

public class clase_9 {
  public static void main(String[] args){
    //Entradas
    Scanner entrada = new Scanner(System.in);
    String nombre = "";
    int clave = 0, antiguedad = 0;
    //Proceso
    System.out.println("¡¡Bienvenidos al sistema vacacional de Coca-Cola Company!!");
    System.out.println("¿Cuál es el nombre del trabajador?");
    nombre = entrada.nextLine();
    System.out.println("¿Cuántos años de servicio tiene el trabajador?");
    antiguedad = entrada.nextInt();
    System.out.println("¿Cuál es la clave de su departamento?");
    clave = entrada.nextInt();
    //Proceso ciclos
    if(clave == 1){
      if(antiguedad == 1){
        System.out.println(nombre + ", derecho 6 días");
      }
      else if(antiguedad >=2 && antiguedad <=6){
        System.out.println(nombre + ", derecho 14 días");
      }
      else if(antiguedad == 7){
        System.out.println(nombre + ", derecho 20 días");
      }
      else{
        System.out.println("Aun no tiene derecho a vacaciones");
      }
    }
    else if(clave == 2){
      if(antiguedad == 1){
        System.out.println(nombre + ", derecho 7 días");
      }
      else if(antiguedad >=2 && antiguedad <=6){
        System.out.println(nombre + ", derecho 15 días");
      }
      else if(antiguedad == 7){
        System.out.println(nombre + ", derecho 22 días");
      }
      else{
        System.out.println("Aun no tiene derecho a vacaciones");
      }
    }
    else if(clave == 3){
      if(antiguedad == 1){
        System.out.println(nombre + ", derecho 10 días");
      }
      else if(antiguedad >=2 && antiguedad <=6){
        System.out.println(nombre + ", derecho 20 días");
      }
      else if(antiguedad == 7){
        System.out.println(nombre + ", derecho 30 días");
      }
      else{
        System.out.println("Aun no tiene derecho a vacaciones");
      }
    }
    else{
      System.out.println("Error, la clave de departamento no existe.");
    }
    entrada.close();
  }
}
