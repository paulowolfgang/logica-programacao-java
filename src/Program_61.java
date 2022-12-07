import java.util.Scanner;

public class Program_61
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        int op = 0;
        int percemBranco, totalVotos = 0;
        
        while(op != -1)
        {
            
            System.out.println("### Sistema de Votação ###");
            System.out.println("Escolha seu candidato: \n");
            System.out.println("1 - Candidato A\n2 - Candidato B\n3 - Candidato C\n"
                    + "4 - Candidato D\n5 - Branco\n-1 - Sair\nOpção: ");
            op = input.nextInt();

            switch(op)
            {
                case 1:{
                    a++;
                    totalVotos++;
                    break;
                }
                case 2:{
                    b++;
                    totalVotos++;
                    break;
                }
                case 3:{
                    c++;
                    totalVotos++;
                    break;
                }
                case 4:{
                    d++;
                    totalVotos++;
                    break;
                }
                case 5:{
                    e++;
                    totalVotos++;
                    break;
                }
                default:{
                    System.out.println("Valor não permitido!");
                    break;
                }
            }
        }
        
        percemBranco = (e * 100) / totalVotos;
        
        System.out.println("\nTotal de votos por candidato: ");
        System.out.println("Candidato A: " + a);
        System.out.println("Candidato B: " + b);
        System.out.println("Candidato C: " + c);
        System.out.println("Candidato D: " + d);
        System.out.println("Votos brancos: " + e);
        System.out.println("\nPorcentagem de votos em branco: " + percemBranco + "%");
    }
}
