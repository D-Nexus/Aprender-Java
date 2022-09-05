//Cadenas numericas con for - while - do-while
public class clase_15 {
  public static void main(String[] args){
    int a = 1, b = 99; //Variables del ciclo while
    int x = 1; //Variable del ciclo do-while

    //Ciclo for
    System.out.println("Ciclo con for");
    for(int i = 1; i<=10; i++){ //Variable del ciclo for es "i"
      if(i < 10){
        System.out.print(i + ", ");
      }else{
        System.out.println(i); //Para no imprimir la "," al final de la secuencia numerica
      }
    }

    //Ciclo while
    System.out.println("Ciclo con while");
    while(a<=5 && b>=95){
      if(a < 5 && b > 95){
        System.out.print(a + ", "+ b + ", ");
      }else{
        System.out.println(a + ", "+ b);
      }
      a++;
      b--;
    }

    //Ciclo do-while
    System.out.println("Ciclo con do-while");
    do{
      if(x < 10){
        System.out.print(x + ", ");
      }else{
        System.out.println(x);
      }
      x++;
    }while(x <=10);
  }
}
