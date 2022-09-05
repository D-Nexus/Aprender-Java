//Ejemplo mas complejo de estructura if - else if - else
public class clase_7 {
  public static void main(String args[]){
    
    int operacion = 1; //Editar valor para cambiar la operación
    int num_uno = 8;
    int num_dos = 4;
    int resultado = 0;

    if(operacion == 1){
      resultado = num_uno + num_dos;
      System.out.println("El resultado de tu suma es: "+ resultado);
    }
    else if(operacion == 2){
      resultado = num_uno - num_dos;
      System.out.println("El resultado de tu resta es: "+ resultado);
    }
    else if(operacion == 3){
      resultado = num_uno * num_dos;
      System.out.println("El resultado de tu multiplicación es: "+ resultado);
    }
    else if(operacion == 4){
      resultado = num_uno / num_dos;
      System.out.println("El resultado de tu división es: "+ resultado);
    }
    else{
      System.out.println("Opción invalida! Error...");
    }
  }
}
