import java.util.Scanner;

public class Program_41
{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe a senha: ");
        String senha = input.next();
        
        if(senha.equals("ASDFG")){
            System.out.println("Acesso liberado.");
        }else{
            System.out.println("Acesso negado!");
        }
    }
}
