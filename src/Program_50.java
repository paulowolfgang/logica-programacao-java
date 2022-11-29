import java.util.Scanner;

public class Program_50
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o salário ");
        double salario = input.nextDouble();
        
        double reajuste = (salario * 50) / 100;
        double reajuste2 = (salario*30) / 100;
        
        if(salario <= 1200)
        {
            System.out.println("Salário reajustado: " + (salario + reajuste));
        }
        else
        {
            System.out.println("Salário reajustado: "+(salario + reajuste2));
        }
    }
}
