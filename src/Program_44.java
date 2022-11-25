import java.util.Scanner;

public class Program_44
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número inteiro: ");
        int num1 = input.nextInt();
        
        System.out.println("Informe outro número inteiro: ");
        int num2 = input.nextInt();
        
        if(num1 > num2)
        {
            System.out.println(num1 + " é maior que " + num2);
        }else if(num1==num2)
        {
            System.out.println(num1 + " é igual à " + num2);
        }else{
            System.out.println(num2 + " é maior que " + num1);
        }
    }
}
