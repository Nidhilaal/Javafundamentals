class enterprise{
    int num;
    boolean value=false;
    public synchronized  void setNum(int num) {
        while(value){
            try {
                wait();
            } catch (Exception e) {
              
            }
        }
        this.num = num;
        System.out.println("put"+num);
        value=true;
        notify();
    }
    public synchronized void getNum() {
        while(!value){
            try {
                wait();
            } catch (Exception e) {
            }
        }
       System.out.println("get"+num); 
       value=false;
       notify();
    }
}

class producer implements Runnable{
    enterprise q;
    public producer(enterprise q) {
        this.q = q;
        Thread t= new Thread(this,"producer");
        t.start();
    }
    public void run(){
        int i=0;
        while (true)
        {
            q.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

class consumer implements Runnable{
    enterprise q;

    public consumer(enterprise q) {
        this.q = q;
        Thread t= new Thread(this,"consumer");
        t.start();
    }
    public void run(){
        
        while (true)
        {
            q.getNum();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}

public class waitnotify {
    public static void main(String[] args) {
        enterprise q=new enterprise();
        new producer(q);
        new consumer(q);
    } 
}
