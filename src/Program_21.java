import java.util.Scanner;

public class Program_21
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a idade (anos): ");
        int idade = input.nextInt();
        
        int meses   = idade * 12;
        int dias    = idade * 365;
        int horas   = dias * 24;
        int minutos = horas * 60;
        
        System.out.println("Resultado: ");
        System.out.println("Meses: " + meses);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
    }
}
