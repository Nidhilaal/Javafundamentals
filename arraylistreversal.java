import java.util.ArrayList;
import java.util.Scanner;
interface a{
    ArrayList m(ArrayList al);
}

class b implements a{
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
    b oB=new b();
    oB.m(al);
    System.out.println(al);
    for (int m: al) {
        System.out.println(m);   
    }
    }   
}