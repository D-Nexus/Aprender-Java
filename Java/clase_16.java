//Sucesión fibonacci
public class clase_16 {
  public static void main(String[] args){
    int a = 0, b = 1, c = 0;

    System.out.println("Serie con for:");
    for(int i=0; i<10; i++){
      System.out.print(a + ",");
      c = a + b;
      a = b;
      b = c;
    }
    
    System.out.println(""); //Salto de linea
    //Reinicia los valores de las variables a su valor inicial
    a = 0; 
    b = 1; 
    c = 0;

    System.out.println("Serie con for pero sin coma final:");
    for(int i=0; i<10; i++){
      if(i < 9){
        System.out.print(a + ",");
      }else{
        System.out.println(a);
      }
      c = a + b;
      a = b;
      b = c;
    }
  }
}
