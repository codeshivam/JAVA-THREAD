class MyThread implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()  +  Thread.currentThread().getId()  +" is running");
	}
}

class Main{

	public static void main(String... arg)
	{
	for(int i=0;i<8;i++)
		{
		Thread thread=new Thread(new MyThread());
		thread.start();
		}
	}
}