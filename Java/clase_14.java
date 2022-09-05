//Ciclo do-while
public class clase_14 {
  public static void main(String[] args) {
    int num = 1000;

    do{ //Ejecuta primero "do" luego verifica la condición del while
      //Instrucciones
      System.out.print(num + ", ");
      num -= 200;
    }while(num >=0); //Condición
    //Mientras la condición del while sea verdadera, Do realizara las instrucciones
  }
}
