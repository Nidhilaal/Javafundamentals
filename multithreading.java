class threadsample extends Thread{
    public void run(){
        for (int i=0;i<6;i++){
            System.out.println("hi");
            try {
                Thread.sleep(1000);
                
            } catch (Exception e) {}
        }
    }
}

public class multithreading{
    public static void main(String[] args) {
        Runnable objHello= ()->{
                for (int i=0;i<6;i++){
                    System.out.println("hello");
                    try {
                        Thread.sleep(1000);
                        
                    } catch (Exception e){}
                }
            };

        threadsample obHi= new threadsample ();
        Thread t=new Thread(objHello);
        t.start(); 
        try {
            Thread.sleep(500);
        } catch (Exception e) { }
        obHi.start();   
    }
}


