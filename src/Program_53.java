import java.util.Scanner;

public class Program_53
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe sua idade: ");
        int idade = input.nextInt();
        
        if(idade >= 5 && idade <= 7)
        {
            System.out.println("Categoria infantil.");
        }
        else if(idade >= 8 && idade <= 10)
        {
            System.out.println("Categoria infantil B.");
        }
        else if(idade >= 11 && idade <= 13)
        {
            System.out.println("Categoria juvenil A.");
        }
        else if(idade >= 14 && idade <= 17)
        {
            System.out.println("Categoria juvenil B.");
        }
        else
        {
            System.out.println("Categoria sênior.");
        }
    }
}
