import java.io.* ;

class Createfile
{
	public static void main(String args[])
	{  
			File f = new File("D:\\Placements\\Java\\File handing\\Demofile.txt");
			try
			{
				if(f.createNewFile())
				{ 
					System.out.println("File created Successfully");
				}
				else
				{
					System.out.println("File already Exists");
				}
			
			}
			catch(IOException i)
			{
				System.out.println("Exception handled Successfully");
			}
		
		}
	}
}
