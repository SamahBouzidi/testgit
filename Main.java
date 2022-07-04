public class Main {
    public static void main (String args [])
    {
        System.out.println("Hello!");
        Pangolin p = new Pangolin("toto", 5);
        Pangolin p1 = new Pangolin("tata", 5);
        System.out.println(p.toString());
        System.out.println(p1.crier());

    }
}