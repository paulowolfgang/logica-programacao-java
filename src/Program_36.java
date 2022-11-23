import java.util.Scanner;

public class Program_36 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a base menor: ");
        float baseMenor = input.nextFloat();
        
        System.out.println("Informe a base maior: ");
        float baseMaior = input.nextFloat();
        
        System.out.println("Informe a altura: ");
        float altura = input.nextFloat();
        
        float area = ((baseMenor * baseMenor) + (baseMaior * baseMaior)) * altura;
        
        System.out.println("Área do trapézio: " + area);
    }
}
