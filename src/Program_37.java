import java.util.Scanner;

public class Program_37 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a base: ");
        float base = input.nextFloat();
        
        System.out.println("Informe a altura: ");
        float altura = input.nextFloat();
        
        float area = base * altura;
        
        System.out.println("Área do retângulo: " + area);
    }
}
