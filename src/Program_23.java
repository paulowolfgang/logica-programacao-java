import java.util.Scanner;

public class Program_23
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o salario: ");
        float salario = input.nextFloat();
        
        float imposto = salario * 5 / 100;
        
        System.out.println("Valor de imposto (5%): R$ " + imposto);
        
    }
}
