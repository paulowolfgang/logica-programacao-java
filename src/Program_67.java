import java.util.Scanner;

public class Program_67
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        int op = 0;
        
        while(op != 5)
        {
        
	        System.out.println("Escolha aoperação desejada: ");
	        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n"
	                + "4 - Divisão\n5 - Sair");
	        op = input.nextInt();
	        
	        switch(op)
	        {
	        	case 1:{
	        		System.out.println("Informe o primeiro valor: ");
	                int valor1 = input.nextInt();
	                System.out.println("Informe o segundo valor: ");
	                int valor2 = input.nextInt();
	                System.out.println("Resultado: " + (valor1 + valor2));
	                break;
	                }
	        	case 2:{
	                System.out.println("Informe o primeiro valor: ");
	                int valor1 = input.nextInt();
	                System.out.println("Informe o segundo valor: ");
	                int valor2 = input.nextInt();
	                System.out.println("Resultado: " + (valor1 - valor2));
	                break;
	                }
	        	case 3:{
	                System.out.println("Informe o primeiro valor: ");
	                int valor1 = input.nextInt();
	                System.out.println("Informe o segundo valor: ");
	                int valor2 = input.nextInt();
	                System.out.println("Resultado: " + (valor1 * valor2));
	                break;
	                }
	        	case 4:{
	            	System.out.println("Informe o primeiro valor: ");
	                int valor1 = input.nextInt();
	                System.out.println("Informe o segundo valor: ");
	                int valor2 = input.nextInt();
	                if(valor2==0){
	                	System.out.println("Segundo valor não pode ser igual à '0'.");
	                }else{
	                	System.out.println("Resultado: " + (valor1 / valor2));
	                }
	                break;
	                }
	        	case 5:{
	                System.out.println("Fim.");
	                System.exit(0);
	                break;
	                }
	        	default:{
	        		System.out.println("Valor informado não permitido.");
	                break;
	            }
	        }
        }
    }
}
