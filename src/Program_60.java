
import java.util.Scanner;

public class Program_60
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int num, resto, eleMesmo = 0, cont = 0, total = 0;
        
        for (int i = 0; i < 5; i++)
        {
            
        
            System.out.println("Informe um número inteiro: ");
            num = input.nextInt();
        
            while(num >= eleMesmo){
                ++eleMesmo;
                
                resto = num % eleMesmo;
                
                if(resto == 0)
                {
                    cont++;
                }
            }
            if(cont <= 2)
            {
                total++;
            }
        }
        System.out.println("Total de números primos: " + total);
    }
}
