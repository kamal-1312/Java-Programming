import java.io.*;


class Fileinfo
{
	public static void main(String args[])
		{
			File f = new File("D:\\Placements\\Java\\File handing\\Demofile.txt");
			if(f.exists())
			{
				System.out.println("File Name :" + f.getName() );
				System.out.println("File Location :" + f.getAbsolutePath() );
				System.out.println("File Writable :" + f.canWrite() );
				System.out.println("File Readable :" + f.canRead() );
				System.out.println("File Size :" + f.length() );
			//	System.out.println("File Remove :" + f.delete()) ;
			}
			else
			{
				System.out.println("File Doesnt exists");
			}
		}	
}
