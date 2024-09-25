class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass();
        System.out.println(o.sum());
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.seta(i);
                o.setb(j);
                System.out.print(o.sum());
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
class MySecondClass {
    private int a;
    private int b;

    int sum() {
        return a+b;
    }

    void seta(int i) {
        a= i;
    }

    void setb(int i) {
        b= i;
    }

    MySecondClass() {

    }

    MySecondClass(int a,int b) {
        this.a = a;
        this.b = b;

    }
}
