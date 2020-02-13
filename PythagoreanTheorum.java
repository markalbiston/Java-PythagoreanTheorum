import java.lang.Math;
public class PythagoreanTheorum{
    public double getHypotenuse(int a, int b){
        double c = Math.sqrt(a*a + b*b); 
        // System.out.println(c);
        return c;
    }
}