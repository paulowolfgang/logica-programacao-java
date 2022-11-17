import java.util.Scanner;

public class Program_27
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe seu ano de nascimento: ");
        int anoNasc = input.nextInt();
        
        System.out.println("Informe o ano atual: ");
        int anoAtual = input.nextInt();
        
        int idade = anoAtual - anoNasc;
        
        int semanas = (idade * 12) * 48;
        
        System.out.println("Idade atual: " + idade);
        System.out.println("Total de semanas: " + semanas);
    }
}
