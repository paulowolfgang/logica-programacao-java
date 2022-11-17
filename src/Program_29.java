import java.util.Scanner;

public class Program_29
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.println("Informe outro número inteiro: ");
        int num2 = input.nextInt();
        
        System.out.println("\nResultado:");
        System.out.println(num1 + " elevado à " + num2 + " é igual a: " + Math.pow(num1, num2));
    }
}
