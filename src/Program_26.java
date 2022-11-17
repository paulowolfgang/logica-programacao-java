import java.util.Scanner;

public class Program_26
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o(os) Kilo(s): ");
        float kilos = input.nextFloat();
        
        System.out.println("Informe as gramas: ");
        float gramas = input.nextFloat();
        
        float totalGramas = (kilos * 1000) + gramas;
        
        System.out.println("Total em gramas: " + totalGramas);
        
        float reajuste = (totalGramas * 5) / 100;
        
        float novoPeso = totalGramas + reajuste;
        
        System.out.println("\nReajuste de peso (5%): " + reajuste);
        System.out.println("Novo peso: " + novoPeso);
        
    }
}
