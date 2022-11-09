import java.util.Scanner;

public class Program_16 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        final float valorMetro = 75.0f;
        
        System.out.println("Informe o comprimento: ");
        float comprimento = input.nextFloat();
        
        System.out.println("Informe a largura: ");
        float largura = input.nextFloat();
        
        System.out.println("Informe a profundidade: ");
        float profundidade = input.nextFloat();
        
        float valorTotal = (profundidade * largura * comprimento) * valorMetro;
        
        System.out.println("Valor da construção: " + valorTotal);
    }
}
