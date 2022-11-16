import java.util.Scanner;

public class Program_24
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o salário: ");
        float salario = input.nextFloat();
        
        float reajuste = (salario * 25) / 100;
        
        float novoSalario = salario + reajuste;
        
        System.out.println("Reajuste: " + reajuste);
        System.out.println("Novo salário: " + novoSalario);
    }
}
