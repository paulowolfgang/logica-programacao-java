
import java.util.Scanner;

public class Program_55
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a opção desejada: ");
        System.out.println("1 - Soma\n2 - Raiz quadrada\n3 - Finalizar\nOpção: ");
        
        int op = input.nextInt();
        
        switch(op){
            case 1:{
                System.out.println("Informe o primeiro valor: ");
                int valor1 = input.nextInt();
                
                System.out.println("Informe o segundo valor: ");
                int valor2 = input.nextInt();
                
                System.out.println("Resultado: " + (valor1+valor2));
                break;}
            case 2:{
                System.out.println("Informe um valor: ");
                double valor = input.nextDouble();
                double raiz = Math.sqrt(valor);
                
                System.out.println("Raíz quadrada de " + valor + ", é: " + raiz);
                break;}
            case 3:{
                System.exit(0);
                break;}
            default:
                System.out.println("Valor não reconhecido.");
        }
    }
}
