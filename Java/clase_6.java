//Condicional if - else if - else
public class clase_6 {
  public static void main(String args[]){

    int matematicas = 5;
    int biologia = 8;
    int quimica = 7;
    int promedio = 0;

    promedio = (matematicas + biologia + quimica) / 3;

    if (promedio >= 4.5){
      System.out.println("Felicidades Aprobaste! -> Tu Nota: " + promedio);
    }
    else{
      System.out.println("Lo lamento Reprobaste -> Tu Nota: " + promedio);
    }
  }
}
