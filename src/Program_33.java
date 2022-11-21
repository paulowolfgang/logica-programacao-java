import java.util.Scanner;

public class Program_33
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a base: ");
        float base = input.nextFloat();
        
        System.out.println("Informe a altura: ");
        float altura = input.nextFloat();
        
        float area = (base * altura) / 2;
        
        System.out.println("Área do triângulo: " + area);
    }
}
