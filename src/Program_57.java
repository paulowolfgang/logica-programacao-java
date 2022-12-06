import java.util.Scanner;

public class Program_57
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int contador = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Informe a idade: ");
            int idade = input.nextInt();
            
            if(idade >= 18)
            {
                contador++;
            }
        }
        System.out.println("Quantidade de pessoas maiores de idade: " + contador);
    }
}
