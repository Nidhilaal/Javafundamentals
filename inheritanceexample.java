import java.util.Scanner;
abstract class hello{
    public abstract int  add();   
}
class hi extends hello{
    private int a;
    private int b;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int add(){
        return a+b;
    }
}
public class inheritanceexample {
    public static void main(String[] args) {
        hi objHi= new hi();
        Scanner scan= new Scanner(System.in);
        System.out.println("enter first ");
        objHi.setA(scan.nextInt());
        System.out.println("enetr seconf");
        objHi.setB(scan.nextInt());
        scan.close();
        System.out.println("hello "+objHi.add()); 
    }
}
