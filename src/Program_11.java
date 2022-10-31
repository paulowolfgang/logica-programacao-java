
import javax.swing.JOptionPane;

public class Program_11 {
    public static void main (String args[]){
    
        String nome1 = JOptionPane.showInputDialog(null, "Informe o primeiro nome: ");
        String nome2 = JOptionPane.showInputDialog(null, "Informe o segundo nome: ");
        String nome3 = JOptionPane.showInputDialog(null, "Informe o terceiro nome: ");
        
        System.out.println("Terceiro nome: " + nome3);
        System.out.println("Segundo nome: " + nome2);
        System.out.println("Primeiro nome: " + nome1);
    }
}
