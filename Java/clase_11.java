//Estructura Switch-Case
public class clase_11 {
  public static void main(String[] args){
    
    int numUno = 5, numDos = 3, resultado = 0;
    int parametro = 2; //Cambiar el parametro manualmente para elegir un "case"
    //switch solo permite 2 parametros "Int" o "Char"
    //Siempre un "break" despues de cada "case"
    switch(parametro){
      case 1: resultado = numUno + numDos;
      System.out.println("El resultado de la suma es: " + resultado);
      break;
      case 2: resultado = numUno - numDos;
      System.out.println("El resultado de la resta es: " + resultado);
      break;
      case 3: resultado = numUno * numDos;
      System.out.println("El resultado de la multiplicación es: " + resultado);
      break;
      case 4: resultado = numUno / numDos;
      System.out.println("El resultado de la división es: " + resultado);
      break;
      //Cuando no se tiene una opción para el parametro podemos usar default como un else
      default: System.out.println("Error, la opción no existe");
      break;
    }
  }
}
