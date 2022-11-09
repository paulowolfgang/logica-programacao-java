import java.util.Scanner;

public class Program_20 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor do salário do funcionário: ");
        float salario = input.nextFloat();
        
        System.out.println("Informe o valor do salário minimo: ");
        float minimo = input.nextFloat();
        
        float resultado = salario / minimo;
        
        System.out.println("Quantidade de salários mínimos recebidos: " + Math.ceil(resultado));
    }
}
