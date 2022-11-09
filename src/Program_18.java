
import java.util.Scanner;

public class Program_18 {
  public static void main(String args[]){
  
      Scanner input = new Scanner(System.in);
      
      System.out.println("Informe o valor de depósito: ");
      double deposito = input.nextDouble();
      
      System.out.println("Informe a taxa de juros: ");
      double taxa = input.nextDouble();
      
      double rendimento = (deposito * taxa) / 100;
      double total = deposito + rendimento;
              
      System.out.println("Rendimento: " + rendimento);
      System.out.println("Total: " + total);
  }  
}
