class ThreadTest extends Thread
{
	public void start()
	{
	System.out.println("start method");
	}
	public void run()
	{
	System.out.println("run method");
	}
}
class Main
{
	public static void main(String[] args)
	{
	ThreadTest ts=new ThreadTest();

	ts.start();//normal start() calling

	System.out.println("Main Thread");

	}
}