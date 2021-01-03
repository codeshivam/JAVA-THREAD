//Overloading of run() method

class ThreadTest extends Thread
{
	public void run()
	{
	System.out.println("no arg");
	}
	public void run(int i)
	{
	System.out.println("no arg");
	}
}
class Main
{
	public static void main(String... arg)
	{
	ThreadTest ts=new ThreadTest();
	ts.start();//it is responsible to call only run() with no rgument
	for(int i=0;i<5;i++)
	{
	System.out.println("main thread");
	}
	}
}