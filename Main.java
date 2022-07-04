public class Main {
    public static void main (String args [])
    {
        System.out.println("Hello!");
        Pangolin p = new Pangolin("toto", 5);
        Pangolin p1 = new Pangolin("Titi", 5);
        Pangolin p2 = new Pangolin("Bidule", 5);
        System.out.println(p.toString());
        System.out.println(p1.crier());
        System.out.println(p.crier());


    }
}