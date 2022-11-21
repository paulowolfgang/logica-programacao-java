import java.util.Scanner;

public class Program_34 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o lado: ");
        float lado = input.nextFloat();
        
        float area = lado * lado;
        
        System.out.println("Área do quadrado: " + area);
    }
}
