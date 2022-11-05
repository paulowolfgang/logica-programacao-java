import java.util.Scanner;
import javax.swing.JOptionPane;

public class Program_13 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a largura: ");
        double largura = input.nextDouble();
        
        System.out.println("Informe o comprimento: ");
        double comprimento = input.nextDouble();
        
        double areaLote = largura * comprimento;
        
        System.out.println("Largura informada: " + largura);
        System.out.println("Comprimento fornecido: " + comprimento);
        System.out.println("Área do lote: " + areaLote);
    }
}
