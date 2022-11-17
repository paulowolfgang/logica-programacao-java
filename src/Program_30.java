import java.util.Scanner;

public class Program_30
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.println("Informe outro número inteiro: ");
        int num2 = input.nextInt();
        
        if (num1 > num2)
        {
        	System.out.println(num2 + " é o menor.");
        }else{
            System.out.println(num1 + " é o menor.");
        } 
    }
}
