// In this we are using join() method which is caller thread (main thread) to wait for called thread (t1 & t2) to complete
// First with the join() it will work & it will wait for the join to complete the exection
/*public class main implements Runnable{
    public void run(){
        synchronized(this){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello "+Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args) {
        main ob = new main();
        main ob1 = new main();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob1);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
		t1.start();
		t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
		System.out.println("Both the threads are over");

    }
}*/







// In this we are using the class lock, it is a lock on a instance of class Class.
// This lock comes in picture in case of synchronized static method.
/*public class main implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{	
                System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
			}
		}
	}
	public static void main(String args[])
	{
		main ob=new main();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
		t1.start();
		t2.start();
		
		System.out.println("Both the threads are over");
	}
}*/







// In this we are using the object lock which is accessed by only one thread at a time
// This lock comes into picture only when object has got non-static synchronized method/s or block
/*public class main implements Runnable
{
	public void run()
	{
		synchronized(this)
		{
			for(int i=0;i<5;i++)
			{	
                System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
			}
		}
	}
	public static void main(String args[])
	{
		main ob=new main();
		main ob1=new main();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob1);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
		t1.start();
		t2.start();
	}
}*/










// In this we are using synchronized block for the program
/*public class main implements Runnable{
    public void run(){
        synchronized(this){
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
            }
        }
        
    }
    public static void main(String[] args) {
        main obj = new main();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/






// In this we are using implements Runnable and we are synchronized keyword to remove the race condition
/*public class main implements Runnable{
    synchronized public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
        }
    }
    public static void main(String[] args) {
        main obj = new main();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        System.out.println("Hello "+Thread.currentThread().getName());
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/






// In this we are using implements Runnable instead of extend Thread with this we can use methods which are provided by Runnable interface
/*public class main implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
        }
    }
    public static void main(String[] args) {
        main obMain = new main();
        Thread t1 = new Thread(obMain);
        Thread t2 = new Thread(obMain);
        System.out.println("Hello "+Thread.currentThread());
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/





// In this 2 threads are been used and we are setting there name and we are printing their info using currentThread() and we are making those thread for 100 millseconds sleep(100)
/*public class main extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+Thread.currentThread().getName()+"\t"+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        main t1 = new main();
        main t2 = new main();
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/












/*// In this 2 threads are used and there name is set using setName() along with the currentThread() info
public class main extends Thread{
    public void run(){
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i);
        }

    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        main t1 = new main();
        main t2 = new main();
        t1.setName("First");
        t2.setName("Second");
        t1.start();
        t2.start();
    }
}*/






/*// Printing Threads with currentThread() method which gives info of currentThread()
public class main extends Thread{

    public void run(){
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i);
        }
    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());     // currentThread() is used for getting the info of currentThread
        main t1 = new main();
        t1.start();

    }
}
*/






/*// Simple thread creation and utilization of the thread
public class main extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello "+i);
        }
    }
    
    public static void main(String[] args) {
        main t1 = new main();
        t1.start();
    }
    
}
*/
