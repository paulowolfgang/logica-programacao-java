import javax.swing.JOptionPane;

public class Program_12 {
    public static void main (String args[]){
    
        String largura     = JOptionPane.showInputDialog(null, "Informe a largura: ");
        String comprimento = JOptionPane.showInputDialog(null, "Informe o comprimento: ");
        
        double areaLote = Double.parseDouble(largura) * Double.parseDouble(comprimento);
        
        JOptionPane.showMessageDialog(null, "Área do lote: " + areaLote);
        
        System.out.println("Largura: " + largura);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Área do lote: " + areaLote);
    }
}
