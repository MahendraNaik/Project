package Assessment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Writer implements Runnable
{
	@Override
	public void run() 
	{
		while(true)
		{
			try 
			{
				read();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}
	public void read() throws IOException
	{
		File file = new File("C:\\Users\\LENOVO\\Desktop\\Project2\\abc.txt");
		FileOutputStream fos = new FileOutputStream(file, true);

		Date date = new Date();
		fos.write(date.getMinutes());
		
		System.out.println("File write is done");
		
		
		fos.close();
	}
}
