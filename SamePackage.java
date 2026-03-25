package pack;

public class SamePackage
{
    public SamePackage()
    {
        Protection p = new Protection();

        System.out.println("Same package class constructor");

        System.out.println("n = " + p.n);
      
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}