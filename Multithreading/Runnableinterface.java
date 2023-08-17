//Implementing Runnable interface in java

class A implements Runnable
{
    public void run()
    {
        try
        {
            for (int i=1;i<=5 ;i++ ) 
            {
                System.out.println("My Child Thread");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException i) 
        {
            
        }
    }
}

class B
{
    public static void main(String[] args) throws InterruptedException
    {
        A r=new A();
        Thread t=new Thread(r);
        t.start();

        for (int i=1;i<=5 ;i++ ) 
        {
            System.out.println("Main Thread");
            Thread.sleep(2000);
        }
    }
}