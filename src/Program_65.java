import java.util.Scanner;

public class Program_65
{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        int num, resto, eleMesmo = 0, cont = 0, somaPrimo = 0, somaPar = 0;
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Informe um número inteiro: ");
            num = input.nextInt();
        
            while(num >= eleMesmo)
            {
                ++eleMesmo;
                
                resto = num % eleMesmo;
                
                if(resto == 0)
                {
                    cont++;
                }
            }
            if(cont <= 2)
            {
                somaPrimo = somaPrimo + num;
            }
            if(num % 2 == 0)
            {
                somaPar = somaPar + num;
            }
        }
        
        System.out.println("Soma dos números primos: " + somaPrimo);
        System.out.println("Soma dos números pares: " + somaPar);
    }
}
