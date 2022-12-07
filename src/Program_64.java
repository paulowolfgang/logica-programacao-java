import java.util.Scanner;

public class Program_64
{
    public static void main(String args[])
    {
    
        Scanner input = new Scanner(System.in);
        
        int idade;
        float peso, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0,
              cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
        
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Informe a idade: ");
            idade = input.nextInt();
            
            System.out.println("Informe o peso: ");
            peso = input.nextFloat();
            
            if(idade >= 1 && idade <= 10)
            {
                faixa1 = faixa1 + peso;
                cont1++;
            }
            if(idade >= 11 && idade <= 20)
            {
                faixa2 = faixa2 + peso;
                cont2++;
            }
            if(idade >= 21 && idade <= 30)
            {
                faixa3 = faixa3 + peso;
                cont3++;
            }
            if(idade >= 30)
            {
                faixa4 = faixa4 + peso;
                cont4++;
            }
        }
        
        float media1 = faixa1 / cont1;
        float media2 = faixa2 / cont2;
        float media3 = faixa3 / cont3;
        float media4 = faixa4 / cont4;
        
        System.out.println("Média faixa 1: " + media1);
        System.out.println("Média faixa 2: " + media2);
        System.out.println("Média faixa 3: " + media3);
        System.out.println("Média faixa 4: " + media4);
    }
}
