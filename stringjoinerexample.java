import java.util.StringJoiner;

public class stringjoinerexample {
    public static void main(String[] args) {
        
        StringJoiner str= new StringJoiner(",");
        str.add("hello").add("how").add("are").add("you");
        System.out.println( str);

        StringJoiner str2 =new StringJoiner(",","(",")");
        str2.add("i'm").add("fine");
        System.out.println(str2);   

        StringJoiner str3= str.merge(str2);
        System.out.println(str3);
        
    } 
}
