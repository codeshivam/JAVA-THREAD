class Main implements Runnable
{
    public static void main(String[] args) {
        Thread Thread1 = new Thread();
        Thread Thread2 = new Thread("Shivam");
        Thread1.start();
        Thread2.start();
        System.out.println("Thread names are following:");
        System.out.println(Thread1.getName());
        System.out.println(Thread2.getName());
    }
    public void run()
	 {

    	 }

}
