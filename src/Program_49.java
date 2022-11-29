import java.util.Scanner;

public class Program_49
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o valor de A: ");
        float a = input.nextFloat();
        
        System.out.println("Informe o valor de B: ");
        float b = input.nextFloat();
        
        System.out.println("Informe o valor de C: ");
        float c = input.nextFloat();
        
        float delta = (b * b) - (4 * a * c);
        
        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("\nResultado: \n");
        System.out.println("Delta: " + delta);
        System.out.println("X': " + x1);
        System.out.println("X'': " + x2);
        
        if(delta == 0)
        {
            System.out.println("Delta é nulo.");
        }
        else if(delta < 0)
        {
            System.out.println("Delta é negativo.");
        }
        else
        {
            System.out.println("Delta é positivo.");
        }
    }
}
