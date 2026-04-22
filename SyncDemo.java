class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

class MyThreadA extends Thread {
    Table t;
    MyThreadA(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class MyThreadB extends Thread {
    Table t;
    MyThreadB(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(10);
    }
}

class SyncDemo {
    public static void main(String[] args) {
        Table obj = new Table();

        MyThreadA t1 = new MyThreadA(obj);
        MyThreadB t2 = new MyThreadB(obj);

        t1.start();
        t2.start();
    }
}