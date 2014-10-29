import java.util.Random;


public class Person implements Runnable
{
	private int id;
	private static Printer printer;
	private Random rand=new Random();
	private int timesPrinted;
	public Person(int id, Printer p)
	{
		this.id=id;
		printer=p;
		timesPrinted=1;

	}
	public int getID()
	{
		return id;
	}
	public void addAPrint()
	{
		timesPrinted++;
	}
	public int getTimesPrinted()
	{
		return timesPrinted;
	}
	@Override
	public void run()
	{
		while (true)
		{
			printer.addPrintJob(this);
			this.addAPrint();
			try
			{
				Thread.sleep(rand.nextInt(15000) + 2000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
}
