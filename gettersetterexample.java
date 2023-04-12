class a{
    int id;
    int salary;
    public int getId() {
        return id;
    }
    public  void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}

public class gettersetterexample extends a {
    public static void main(String[] args) 
    {
        a b= new a();
        b.setId(5);
        System.out.println(b.getId());
    }
    
}
