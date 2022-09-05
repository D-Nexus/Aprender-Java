//Diferencia entre usar parentesis en operaciones matematicas
public class clase_5 {
  public static void main(String args[]){

    int numero_uno = 4;
    int numero_dos = 4;
    int resultado = 0;

    System.out.println("La operación: 4 + 4 /2");
    resultado = numero_uno + numero_dos / 2;
    System.out.println("El resultado de la operación es: " + resultado);

    System.out.println("La operación: (4 + 4) /2");
    resultado = (numero_uno + numero_dos) / 2;
    System.out.println("El resultado de la operación es: " + resultado);
  }
}
