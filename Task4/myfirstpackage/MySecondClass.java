package myfirstpackage;
public class MySecondClass {
    private int a;
    private int b;

    public int sum() {
        return a+b;
    }

    public void seta(int i) {
        a= i;
    }

    public void setb(int i) {
        b= i;
    }

    public int geta(){
        return a;
    }

    public int getb(){
        return b;
    }

    public MySecondClass() {

    }

    public MySecondClass(int a,int b) {
        this.a = a;
        this.b = b;

    }
}
