import java.util.Scanner;

public class Program_42 {
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        float n1 = input.nextFloat();
        
        System.out.println("Informe a segunda nota: ");
        float n2 = input.nextFloat();
        
        System.out.println("Informe a terceira nota: ");
        float n3 = input.nextFloat();
        
        System.out.println("Informe a quarta nota: ");
        float n4 = input.nextFloat();
        
        float media = (n1 + n2 + n3 + n4) / 4;
        
        if(media >= 7){
            System.out.println("Aprovado com média " + media);
        }else{
            System.out.println("Aluno reprovado.");
        }
    }
}
