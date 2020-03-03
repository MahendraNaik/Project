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
				e.printStackTrace();
			}
		}
	}
	
	public void write() throws IOException
	{
		File file = new File("C:\\Users\\LENOVO\\Desktop\\Project2\\abc.txt");
		FileInputStream fis = new FileInputStream(file);
		
		int read;
		
		while((read=fis.read())!=-1) 
		{
			System.out.print((char)read);
		}
		
		System.out.println(read);
		
		fis.close();
	}
}
