import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylistexample {
    public static void main(String[] args) {
        ArrayList <Integer> aList= new ArrayList<Integer>();
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the limit");
        int  n= scan.nextInt();
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){
            aList.add(scan.nextInt());
        }
        scan.close();
        Collections.sort(aList);
        Collections.sort(aList,Collections.reverseOrder());
        System.out.println("number fetched");
        System.out.println(aList.get(n-2));
        System.out.println(aList);   
    }  
    
}
