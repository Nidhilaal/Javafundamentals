import java.util.ArrayList;
import java.util.Scanner;
interface sample{
    ArrayList m(ArrayList al);
}

class example implements sample{
    public ArrayList<Integer> m(ArrayList al){
        int temp;
        for (int i=0;i<al.size()/2;i++){
                temp=(int ) al.get(i);
                al.set(i,al.get(al.size()-1-i));
                al.set(al.size()-1-i,temp);       
        }
        return al;
    }
}
public class arraylistreversal{
    public static void main(String[] args) {
   
    ArrayList <Integer>al= new ArrayList<Integer>();
    Scanner s= new Scanner(System.in);
    System.out.println("enter the limit");
    int n= s.nextInt();
    System.out.println("eneter the elements");
    for(int i=0;i<n;i++){
        al.add(s.nextInt());
    }
    s.close();
    example oB=new example();
    oB.m(al);
    System.out.println(al);
    for (int m: al) {
        System.out.println(m);   
    }
    }   
}