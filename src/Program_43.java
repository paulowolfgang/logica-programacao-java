import java.util.Scanner;

public class Program_43
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe o salário: ");
        double salario = input.nextDouble();
        
        double reajuste = (salario * 30) / 100;
        
        if(salario <= 850)
        {
            System.out.println("Salário com reajuste: " + (salario + reajuste));
        }else{
            System.out.println("Você não tem direito a reajuste.");
        }
    }
}
