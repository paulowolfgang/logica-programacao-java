import java.util.Scanner;

public class Program_35
{
    public static void main(String args[]){
        
        final float pi = 3.14f;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o raio: ");
        float raio = input.nextFloat();
        
        float area = pi * (raio * raio);
        
        System.out.println("Área do círculo: " + area);
    }
}
