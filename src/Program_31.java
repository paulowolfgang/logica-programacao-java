import java.util.Scanner;

public class Program_31
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num = input.nextInt();
        
        System.out.println(num + " elevado ao quadrado: " + Math.pow(num, num));
        System.out.println("Raiz quadrada de " + num + ": " + Math.sqrt(num));
    }
}
