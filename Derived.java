package pack2;

import pack.Protection;

public class Derived extends Protection
{
    public Derived()
    {
        System.out.println("Derived class constructor");


        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub); 
    }
}