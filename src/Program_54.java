
import java.util.Scanner;

public class Program_54
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        float peso1 = 2, peso2 = 3, peso3 = 5;
        
        System.out.println("Informe a nota do laboratório: ");
        float nota1 = input.nextFloat();
        
        System.out.println("Informe a nota do semestre: ");
        float nota2 = input.nextFloat();
        
        System.out.println("Informe a nota do exame final: ");
        float nota3 = input.nextFloat();
        
        float media = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) / (peso1+peso2+peso3);
        
        if(media >= 8 && media <= 10)
        {
            System.out.println("Conceito: A");
        }
        else if(media >= 7 && media <= 9)
        {
            System.out.println("Conceito: B");
        }
        else if(media >= 6 && media >= 7)
        {
            System.out.println("Conceito: C");
        }
        else if(media >= 5 && media <= 6)
        {
            System.out.println("Conceito: D");
        }
        else if(media > 5)
        {
            System.out.println("Conceito: E");
        }
    }
}
