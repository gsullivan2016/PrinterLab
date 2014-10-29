import java.util.ArrayList;
import java.util.Random;


public class Printer implements Runnable
{
	//private int TimesPrinted;
	//Random rand = new Random();
	private ArrayList<String> jobList;


	public  Printer()
	{
		//TimesPrinted=0;
		jobList=new ArrayList<String>();
		
	}

	public void run()
	{
		while(true)
		{
			if(jobList.size() > 0)
				this.print();
			
			try
			{
				Thread.sleep(2000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		//TimesPrinted++;

	}

	public void print()
	{
		System.out.println(jobList.get(0));
		jobList.remove(0);
		
	}
	
	public void addPrintJob(Person p)
	{
		jobList.add("Person " + p.getID() + "\n" + "has used the printer for the " + p.getTimesPrinted() + " time.");
	}

}