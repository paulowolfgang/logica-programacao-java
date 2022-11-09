import java.util.Scanner;
import javax.swing.JOptionPane;

public class Program_17 {
    public static void main (String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        double n1 = input.nextDouble();
        
        System.out.println("Informe o peso da nota: ");
        double p1 = input.nextDouble();
        
        System.out.println("Informe a segunda nota: ");
        double n2 = input.nextDouble();
        
        System.out.println("Informe o peso da nota: ");
        double p2 = input.nextDouble();
        
        double media = (n1 * p1) + (n2 * p2) / (p1 + p2);
        
        System.out.println("Média ponderada: " + Math.ceil(media)); //Arredonda o valor matemático.
        
        if (media >= 7){
            System.out.println("Aluno aprovado!!!");
        }else{
            System.out.println("Aluno reprovado.");
        }
    }
}
