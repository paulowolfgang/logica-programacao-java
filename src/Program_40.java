import java.util.Scanner;

public class Program_40 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro: ");
        int num = input.nextInt();
        
        if(num % 2 == 0){
            System.out.println(num + " é um número par.");
        }else{
            System.out.println(num + " é um número impar.");
        }
    }
}
