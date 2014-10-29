
public class MainClass
{
public static void main(String[] args)
{	
	Printer p=new Printer();Person Alex=new Person(1,p);
	Person Franz=new Person(2,p);
	Person Camille=new Person(3,p);
	Person Patrick=new Person(4,p);
	Person Andrew=new Person(5,p);

	Thread pThread = new Thread(p);
	Thread franzThread = new Thread(Franz);
	Thread AlexThread = new Thread(Alex);
	Thread CamilleThread = new Thread (Camille);
	Thread PatrickThread = new Thread(Patrick);
	Thread AndrewThread = new Thread (Andrew);
	
	pThread.start();
	franzThread.start();
	AlexThread.start();
	CamilleThread.start();
	PatrickThread.start();
	AndrewThread.start();
	

	
}

}
