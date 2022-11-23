import java.util.Scanner;

public class Program_39 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();
        
        if(idade >= 18){
            System.out.println("Maior de idade.");
        }else{
            System.out.println("Menor de idade.");
        }
    }
}
