import myfirstpackage.*;
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