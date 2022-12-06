import java.util.Scanner;

public class Program_58
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, faixa5 = 0;
        int percem1, percem2, percem3, percem4, percem5;
        int totalPessoas = 0;
        
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Informe a idade: ");
            int idade = input.nextInt();
            
            totalPessoas++;
            
            if(idade <= 15)
            {
                faixa1++;
            }
            else if(idade >= 16 && idade <= 30)
            {
                faixa2++;
            }
            else if(idade >= 31 && idade <= 45)
            {
                faixa3++;
            }
            else if(idade >= 46 && idade <= 60)
            {
                faixa4++;
            }
            else
            {
                faixa5++;
            }
        }
        
        percem1 = (faixa1 * 100) / totalPessoas;
        percem2 = (faixa2 * 100) / totalPessoas;
        percem3 = (faixa3 * 100) / totalPessoas;
        percem4 = (faixa4 * 100) / totalPessoas;
        percem5 = (faixa5 * 100) / totalPessoas;
        
        System.out.println("Faixa de idade (menor que 15 anos): " + faixa1 + ", " + percem1 + "%");
        System.out.println("Faixa de idade (16 à 30): " + faixa2 + ", " + percem2 + "%");
        System.out.println("Faixa de idade (31 à 45): " + faixa3 + ", " + percem3 + "%");
        System.out.println("Faixa de idade (46 à 60): " + faixa4 + ", " + percem4 + "%");
        System.out.println("Faixa de idade (maior que 60 anos): " + faixa5 + ", " + percem5 + "%");
        System.out.println("Total de pessoas: " + totalPessoas);
    }
}
