import java.util.Scanner;

public class Program_45
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int negativo = 0;
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Informe um valor inteiro: ");
            int numero = input.nextInt();
            
            if(numero < 0)
            {
                negativo++;
            }
        }
        System.out.println("Quantidade de números negativos: " + negativo);
    }
}
