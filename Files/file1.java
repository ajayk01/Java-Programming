import java.io.DataInputStream; 
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException; 
class file1 
{ 
	public static void main(String[] args) throws IOException 
	{ 
		DataInputStream dis=new DataInputStream(System.in); 
		FileOutputStream fout=new FileOutputStream("/home/student/18itr004/file.txt");
		 FileInputStream fin=new FileInputStream("/home/student/18itr004/file.txt");  
		System.out.println("Enter the intergers  (@ at the end):"); 
		int i; 
		while((i=dis.read())!='@') 
		{ 
			fout.write(i); 
		} 
		fout.close();
               FileOutputStream fout1=new FileOutputStream("/home/student/18itr004/file1.txt");
		do{
		  i=fin.read();
                  fout1.write(i);
                 }while(i!=-1);
		fin.close();
		fout1.close();

	} 
} 

