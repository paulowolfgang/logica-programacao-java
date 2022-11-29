import java.util.Scanner;
import javax.swing.JOptionPane;

public class Program_46
{
    public static void main(String args[]){
    
        String palavra = "";
        
        String a;
        
        palavra = JOptionPane.showInputDialog(palavra);
        
        int i = palavra.length();
        
        for(i = palavra.length() -1; i> -1; --i){
            a = String.valueOf(palavra.charAt(i));
            System.out.println(a);
        }
    }
}
