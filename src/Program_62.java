public class Program_62
{
    public static void main(String args[]){
        
        double f = 50;
        
        for (int i = 1; i <= 16; i++) {
            
            double c = (f - 32) / 1.8;
            System.out.println(" F°: "+f+", = C°: " + Math.ceil(c));
            ++f;
        }
    }
}
