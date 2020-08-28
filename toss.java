package assignment;
	import java.util.Scanner;
	public class toss implements Runnable{
	public boolean exit;
	Thread t;


	toss()
	{

	t = new Thread(this);
	exit = false;  
	t.start();
	}


	public void run()
	{

	while (!exit) {



	try {

	int flip=1000;
	func(flip);
	   
	Thread.sleep(100);
	}
	catch (InterruptedException e) {
	System.out.println("ex:" + e);
	}
	}
	System.out.println( " Stopped.");
	}


	public void stop()
	{
	exit = true;
	}


	public void func(int flip){

	int heads = 0;
	int tails = 0;
	int counter = 1;
	double randNum = 0.0;
	Scanner in = new Scanner(System.in);


	int flips = flip;

	while(counter <= flips)
	{
	randNum = Math.random();


	if(randNum < .5)
	{
	heads++;

	}
	else
	{
	tails++;

	}
	counter++;      
	}
	System.out.println();
	System.out.println("No. of heads = " + heads);
	System.out.println("N0. of tails = " + tails);

	}

	public static void main(String[] args) {


	toss t=new toss();  

	try {
	Thread.sleep(1000);
	t.stop();

	}
	catch (InterruptedException e) {
	System.out.println("catch:" + e);
	}


	}
	}

