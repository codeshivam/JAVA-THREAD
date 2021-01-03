class MyThread extends Thread
{
	public void run()
	{
	for(int i=0;i<5;i++)
		{
		System.out.println("thread called");
		}
	}
}
class Main
{
	public static void main(String... arg)
	{
	MyThread thread=new MyThread();
	thread.start();//start() method of thread class always call run() method
	for(int i=0;i<5;i++)
		{
		System.out.println("Main Thread");
		}
	}
}