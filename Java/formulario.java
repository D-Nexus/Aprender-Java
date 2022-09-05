import javax.swing.*;
public class formulario extends JFrame{
  private JLabel label1;

  public formulario(){
    setLayout(null);
    label1 = new JLabel("Interfaz grafica");
    label1.setBounds(150,30,300,300);
    add(label1);
  }

  public static void main(String args[]){
    formulario formulario1 = new formulario();
    formulario1.setBounds(0,0,400,400);
    formulario1.setVisible(true);
    formulario1.setLocationRelativeTo(null);
  }
}
