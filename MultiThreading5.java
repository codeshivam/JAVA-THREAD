//Overloading of run() method

class ThreadTest extends Thread
{
	public void start()
	{
	//super.start();//threats called nd created here
	System.out.println("normal start method");
	}
	public void run()
	{
	System.out.println("thread executed");
	}
}
class Main
{
	public static void main(String... arg)
	{
	ThreadTest ts=new ThreadTest();
	ts.start();//normal start method called
	for(int i=0;i<5;i++)
	{
	System.out.println("main thread");
	}
	}
}