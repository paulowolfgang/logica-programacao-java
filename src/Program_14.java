import java.util.Scanner;

public class Program_14 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        // Produto 01
        System.out.println("Informe a quantidade do produto 01: ");
        int qtd01 = input.nextInt();
        
        System.out.println("Informe o valor do produto 01: ");
        double valor01 = input.nextDouble();
        
        // Produto 02
        System.out.println("Informe a quantidade do produto 02: ");
        int qtd02 = input.nextInt();
        
        System.out.println("Informe o valor do produto 02: ");
        double valor02 = input.nextDouble();
        
        // Produto 03
        System.out.println("Informe a quantidade do produto 03: ");
        int qtd03 = input.nextInt();
        
        System.out.println("Informe o valor do produto 03: ");
        double valor03 = input.nextDouble();
        
        // Resultado
        double total = (qtd01 * valor01) + (qtd02 * valor02) + (qtd03 * valor03);
        
        System.out.println("Total: " + total);
    }
}
