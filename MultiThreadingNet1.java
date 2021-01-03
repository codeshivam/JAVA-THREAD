class MyThread extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName() +"is running");
	}
}

class Main{

	public static void main(String... arg)
	{
	
	for(int i=0;i<8;i++)
		{
		MyThread thread=new MyThread();
		thread.start();
		}
	}
}