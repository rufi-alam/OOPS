//Multithreading extend thread class in java 


class A extends Thread
{
    public void fun()
    {
        try
        {
            for (int i=1;i<=5 ;i++ ) 
            {
               System.out.println("Rufi");
               Thread.sleep(1000);
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
        A t=new A();
        t.fun();

        for (int i=1;i<=5 ;i++ ) 
        {
            System.out.println("Rahul");
            Thread.sleep(1000);
        }
    }
}