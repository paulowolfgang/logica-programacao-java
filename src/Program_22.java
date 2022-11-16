
import java.util.Scanner;

public class Program_22 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor de hora(as): ");
        double hora = input.nextDouble();
        
        System.out.println("Informe o valor de minutos: ");
        double minutos = input.nextDouble();
        
        double resultado = (hora * 60) + minutos;
        
        System.out.println("Quantidade total de minutos: " + resultado);
        
    }
}
