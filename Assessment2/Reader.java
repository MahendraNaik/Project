package Assessment2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader implements Runnable
{
	@Override
	public void run() 
	{
		while(true)
		{
			try 
			{
				write();
			} 
			catch (FileNotFoundException e) 
			{
				File file = new File("C:\\Users\\LENOVO\\Desktop\\Project2\\abc.txt");
				
			} 
			catch (IOException e) 
			{
				System.out.println(e);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public void write() throws IOException, InterruptedException
	{
		File file = new File("C:\\Users\\LENOVO\\Desktop\\Project2\\abc.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int read;
		
		synchronized (this) 
		{
			while((read=fis.read())!=-1) 
			{
				System.out.print((char)read);
			}
		}
		
		System.out.println(read);
		
		Thread.sleep(10000);
		

		file.delete();
		System.out.println("File Deleted");
		
		fis.close();
	}
}
