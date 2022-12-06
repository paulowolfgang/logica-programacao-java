import java.util.Scanner;

public class Program_59
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int num, resto, eleMesmo = 0, cont = 0;
        
        System.out.println("Informe um número inteiro: ");
        num = input.nextInt();
        
        while(num >= eleMesmo)
        {
            ++eleMesmo;
            resto = num%eleMesmo;
            
            if(resto == 0)
            {
                cont++;
            }
        }
        
        if(cont <= 2)
        {
            System.out.println("O número é primo.");
        }
        else
        {
            System.out.println("O número não é primo.");
        }
    }
}
