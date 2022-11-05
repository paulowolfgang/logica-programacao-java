import java.util.Scanner;

public class Program_15 {
   public static void main(String args[]){
   
       Scanner input = new Scanner(System.in);
       
       System.out.println("Informe o primeiro valor (inteiro): ");
       int v1 = input.nextInt();
       
       System.out.println("Informe o segundo valor (inteiro): ");
       int v2 = input.nextInt();
       
       System.out.println("Informe o terceiro valor (inteiro): ");
       int v3 = input.nextInt();
       
       System.out.println("Informe o quarto valor (inteiro): ");
       int v4 = input.nextInt();
       
       int soma = v1 + v2 + v3 + v4;
       int media = soma / 4;
       
       int perCem1 = v1 * soma / 100;
       int perCem2 = v2 * soma / 100;
       int perCem3 = v3 * soma / 100;
       int perCem4 = v4 * soma / 100;
       
       System.out.println("\nSomatório: " + soma);
       System.out.println("Média: " + media);
       System.out.println("\nPercentual em relação à soma: \nValor 01: " + perCem1 + "%\nValor 02: " + perCem2 +
            "%\nValor 03: " + perCem3 + "%\nValor 04: " + perCem4 + "%");
   } 
}
