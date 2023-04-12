import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class library{
   private int bookid;
   private  int price;
   private String bookname;
public int getBookid() {
    return bookid;
}
public void setBookid(int bookid) {
    this.bookid = bookid;
}
public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price = price;
}
public String getBookname() {
    return bookname;
}
public void setBookname(String bookname) {
    this.bookname = bookname;
}
}
public class comparatorexample {
    public static void main(String[] args) {
            ArrayList<library> al= new <library> ArrayList();
        
            library objLibrary1=new library();
            objLibrary1.setBookid(1);
            objLibrary1.setBookname("hello");
            objLibrary1.setPrice(100);
                    
            library objLibrary2=new library();
            objLibrary2.setBookid(2);
            objLibrary2.setBookname("jee");
            objLibrary2.setPrice(150);
                    
            library objLibrary3=new library();
            objLibrary3.setBookid(3);
            objLibrary3.setBookname("li");
            objLibrary3.setPrice(200);
            al.add(objLibrary1);
            al.add(objLibrary2);
            al.add(objLibrary3);

            for (library n:al) {
                System.out.println(n.getBookname()+"hello");
                  
                
            }
          
    }
    
}
