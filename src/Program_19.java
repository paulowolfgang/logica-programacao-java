import java.util.Scanner;

public class Program_19 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro: ");
        int x = input.nextInt();
        
        System.out.println("\nTabuada de " + x + ": \n");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }
}
