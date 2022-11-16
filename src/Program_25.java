import java.util.Scanner;

public class Program_25
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor do salário minimo: ");
        float salario = input.nextFloat();
        
        System.out.println("Informe a quantidade de Kw consumida: ");
        float kw = input.nextFloat();
        
        float valorKw        = (salario * 2 ) / 100;
        float valorPagamento = valorKw * kw;
        float desconto       = (valorPagamento * 15) / 100;
        float novoPagamento  = valorPagamento - desconto;
        
        System.out.println("\nFatura:");
        System.out.println("Valor Kw: " + valorKw);
        System.out.println("Valor a pagar: " + valorPagamento);
        System.out.println("Desconto (15%): " + desconto);
        System.out.println("Total: " + novoPagamento);
    }
}
