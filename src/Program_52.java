import java.util.Scanner;

public class Program_52
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o código do produto: ");
        int codigo = input.nextInt();
        
        System.out.println("Informe o valor do produto: ");
        float valor = input.nextFloat();
        
        if(codigo == 1)
        {
            float perCem = (valor * 15) / 100;
            System.out.println("Valor reajustado: " + (valor + perCem));
        }
        else if(codigo == 3)
        {
            float perCem = (valor * 20) / 100;
            System.out.println("Valor reajustado: " + (valor + perCem));
        }
        else if(codigo == 4)
        {
            float perCem = (valor * 35) / 100;
            System.out.println("Valor reajustado: " + ( valor + perCem));
        }
        else if(codigo == 8)
        {
            float perCem = (valor * 40) / 100;
            System.out.println("Valor reajustado: " + (valor + perCem));
        }
    }
}
