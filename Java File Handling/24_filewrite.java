import java.io.*;

class Filewriter
{
	public static void main(String args[])
	{
		try{
			
			FileWriter f = new FileWriter("D:\\Placements\\Java\\File handing\\Demofile.txt");
			
			try
			{
				f.write("I am an Hindu nationalist");
			}
			finally
			{
				f.close();
			}

			System.out.println("SuccsessFully Created and written in file");
			
		}
		catch(IOException E)
		{
			System.out.println("SuccsessFully Handled");
		}
	}
}	