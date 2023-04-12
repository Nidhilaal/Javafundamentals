import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamsexample {
    public static void main(String[] args) {
        //filter
        List <Integer>numbersList=Arrays.asList(1,2,4);
        List <Integer> evenIntegers=new ArrayList<Integer>();
        evenIntegers= numbersList.stream().filter(n->n%2==0).collect(Collectors.toList());//predicate in filter
        System.out.println(evenIntegers);
        numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));// consumer intefarce
        numbersList.stream().filter(n->n%2==0).forEach(System.out::println);

        //map
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(5);
        al.add(500);
        al.add(500);
        al.add(5000);
        al.add(50000);
        al.stream().map(n->n+10).forEach(System.out::println);

        //flatmap
        List a1= (Arrays.asList(1,2));
        List a2= (Arrays.asList(1,2));
        List a3= (Arrays.asList(1,2));
        List <List<Integer>> finallList=Arrays.asList(a1,a2,a3);
        List <Integer> rahul=finallList.stream().flatMap(x->x.stream().map(m->m+5)).collect(Collectors.toList());
        System.out.println(rahul);

        //distinct
        List hello=al.stream().distinct().collect(Collectors.toList());
        System.out.println(hello);
        //count

        Long countList=hello.stream().count();
        System.out.println(countList);

    }
    
}
