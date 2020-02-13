public class PythagoreanTheorumTest{
    public static void main (String[] args){
        PythagoreanTheorum pT = new PythagoreanTheorum();
        double hypotenuse = pT.getHypotenuse(11, 27);
        System.out.println(hypotenuse);
    }
}