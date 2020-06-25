package app;
 
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;  
import java.util.*;
public class First extends Applet{ 
String a;

	public void init() {
		 //setBackground(Color.red);
		 setBackground(Color.cyan);
		 setForeground(Color.RED);
		 a=" to";
	}
	 public void start(){
		 a+=" companies";
	 }
	
  
public void paint(Graphics g){  
g.setColor(Color.red);
String a1,a2,a3,a4;
Scanner m=new Scanner(System.in);
System.out.println("Enter the company name");
a1=m.nextLine();
g.drawString("welcome  "+a1,45,52);  
}  
  
}  