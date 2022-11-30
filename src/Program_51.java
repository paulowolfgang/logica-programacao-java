import java.util.Scanner;

public class Program_51
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe sua altura: ");
        double altura = input.nextDouble();
        
        System.out.println("Informe o sexo (M/F): ");
        String sexo = input.next();
        
        if(sexo.equals("M") || sexo.equals("m"))
        {
            double pesoIdeal = (72.7 * altura) - 58;
            System.out.println("Peso ideal: " + pesoIdeal);
        }
        else if(sexo.equals("F")||sexo.equals("f"))
        {
            double pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Peso idadel: " + pesoIdeal);
        }
        else
        {
            System.out.println("Sexo não reconhecido.");
        }
    }
}
