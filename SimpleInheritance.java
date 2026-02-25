class A {

    int i, j;  
    void showij() {
        System.out.println("i: " + i + "  j: " + j);
    }
}

class B extends A {

    int k;  
   
    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        int total = i + j + k;
        System.out.println("Sum of i, j, k: " + total);
    }
}

class SimpleInheritance {

    public static void main(String args[]) {

        A superOb = new A();
        superOb.i = 10;
        superOb.j = 20;

        System.out.println("Contents of superOb:");
        superOb.showij();

        B subOb = new B();
        subOb.i = 30;  
        subOb.j = 40; 
        subOb.k = 50;  

        System.out.println("\nContents of subOb:");
        subOb.showij();   
        subOb.showk();    
        subOb.sum();    
    }
}