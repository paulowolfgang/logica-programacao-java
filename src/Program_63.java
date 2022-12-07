import java.util.Scanner;

public class Program_63
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        String sexo, experiencia;
        int idade = 0, contadorMasc = 0, contadorFem = 0, totalHexpe = 0,
            totalIdade = 0, contadorPercem = 0, mulheresMenor = 0, menorIdade =0;
        
            
            
        while(idade != -1)
        {
            
            System.out.println("Informe a idade: ");
            idade = input.nextInt();
            
            System.out.println("Informe o sexo (M/F): ");
            sexo = input.next();
            
            System.out.println("Possui experiência? (S/N): ");
            experiencia = input.next();
            
            if(sexo.equals("M") || sexo.equals("m"))
            {
                contadorMasc++;
            }
            if(sexo.equals("F") || sexo.equals("f"))
            {
                contadorFem++;
            }
            if(sexo.equals("M") || sexo.equals("f") && experiencia.equals("S") ||
                experiencia.equals("s"))
            {
                totalIdade = totalIdade+idade;
                totalHexpe++;
            }
            if(sexo.equals("M") || sexo.equals("m") && idade >= 45)
            {
                contadorPercem++;
            }
            if(sexo.equals("F") || sexo.equals("f") && idade > 35 &&
                experiencia.equals("S") || experiencia.equals("s"))
            {
                    mulheresMenor++;
            }
        }
        
        float mediaHomens = totalIdade / totalHexpe;
        float perCem = (contadorPercem * 100) / contadorMasc;
        
        System.out.println("candidatos masculinos: " + contadorMasc);
        System.out.println("Candidatas femininas: " + contadorFem);
        System.out.println("Idade média de homens com experiência: "
            + mediaHomens + " anos.");
        System.out.println("Porcentagem de homens com mais de 45"
            + " anos com experiência: " + perCem + "%");
        System.out.println("Total de mulheres com idade superior à 35 anos, "
                + "e experiência: " + mulheresMenor);
    }
}
