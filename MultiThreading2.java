class ThreadTest extends Thread
{
}
class Main
{
	public static void main(String[] args)
	{
	ThreadTest ts=new ThreadTest();
	ts.start();
	System.out.println("Main Thread");
	}
}