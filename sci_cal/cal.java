import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="javacalculator.java" height="500" width="500">
</applet>
*/
public class cal extends Applet implements ActionListener
{
int b;
double res;
String s1,s2,s3;
Button b1=new Button("1");
Button b2=new Button("2");
Button b3=new Button("3");
Button b4=new Button("4");
Button b5=new Button("5");
Button b6=new Button("6");
Button b7=new Button("7");
Button b8=new Button("8");
Button b9=new Button("9");
Button b0=new Button("0");		
Button ba=new Button("+");		
Button bs=new Button("-");		
Button bm=new Button("*");		
Button bd=new Button("/");
Button be=new Button("=");
Button bdot=new Button(".");
Button bsq=new Button("square");
Button bsrt=new Button("sqrt");
Button bclr=new Button("Clr");
Button bsin=new Button("Sin");
Button bcos=new Button("Cos");
Button blog=new Button("log");
TextField t=new TextField();
public void init()
{
setLayout(new GridLayout(5,9,5,4));
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b0);		
add(ba);	
add(bs);
add(bm);
add(bd);
add(bdot);
add(bsq);
add(bsrt);
add(bsin);
add(bcos);
add(blog);
add(bclr);		
add(be);	
add(t);	
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);	
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
ba.addActionListener(this);
bs.addActionListener(this);
bm.addActionListener(this);	
bd.addActionListener(this);
be.addActionListener(this);		
bsq.addActionListener(this);	
bsrt.addActionListener(this);	
bclr.addActionListener(this);	
bsin.addActionListener(this);	
bcos.addActionListener(this);
blog.addActionListener(this);	
bdot.addActionListener(this);			
t.setText(" ");  					
}
public void actionPerformed(ActionEvent e)
{  

if(e.getSource()==b1)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("1");
else
t.setText(t.getText()+"1");
}
if(e.getSource()==b2)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("2");
else
t.setText(t.getText()+"2");
}	
if(e.getSource()==b3)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("3");
else
t.setText(t.getText()+"3");
}
if(e.getSource()==b4)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("4");
else
t.setText(t.getText()+"4");
}
if(e.getSource()==b5)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("5");
else
t.setText(t.getText()+"5");
}	
if(e.getSource()==b6)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("6");
else
t.setText(t.getText()+"6");
}
if(e.getSource()==b7)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("7");
else
t.setText(t.getText()+"7");
}
if(e.getSource()==b8)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("8");
else
t.setText(t.getText()+"8");
}	
if(e.getSource()==b9)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("9");
else
t.setText(t.getText()+"9");
}
if(e.getSource()==b0)
{
s1=t.getText();
if(s1.equals("0"))
t.setText("0");
else
t.setText(t.getText()+"0");
}
if(e.getSource()==ba)
{
s2=t.getText();
b=1;
t.setText("0");				
}
if(e.getSource()==bs)
{
s2=t.getText();
b=2;
t.setText("0");				
}
if(e.getSource()==bm)
{
s2=t.getText();
b=3;
t.setText("0");				
}
if(e.getSource()==bd)
{
s2=t.getText();
b=4;
t.setText("0");				
}
if(e.getSource()==bsq)
{
s2=t.getText();
b=5;
t.setText("0");				
}
if(e.getSource()==bsrt)
{
s2=t.getText();
b=7;
t.setText("0");				
}
if(e.getSource()==bclr)
{
t.setText("");	
}
if(e.getSource()==bsin)
{
s2=t.getText();
b=10;
t.setText("0");				
}
if(e.getSource()==blog)
{
s2=t.getText();
b=11;
t.setText("0"); 
}
if(e.getSource()==be)
{
switch(b)
{
case 1:
s3=t.getText();
res=Double.parseDouble(s2)+Double.parseDouble(s3);
t.setText(String.valueOf(res));
break;
case 2:
s3=t.getText();
res=Double.parseDouble(s2)-Double.parseDouble(s3);
t.setText(String.valueOf(res));
break;
case 3:
s3=t.getText();
res=Double.parseDouble(s2)*Double.parseDouble(s3);
t.setText(String.valueOf(res));
break;
case 4:
s3=t.getText();
res=Double.parseDouble(s2)/Double.parseDouble(s3);
t.setText(String.valueOf(res));
break;
case 5:
res=Double.parseDouble(s2)*Double.parseDouble(s2);
t.setText(String.valueOf(res));
break;
case 6:
res=Double.parseDouble(s2)*Double.parseDouble(s2)*Double.parseDouble(s2);
t.setText(String.valueOf(res));
break;
case 7:
res=Math.sqrt(Double.parseDouble(s2));
t.setText(String.valueOf(res));
break;
case 8:
res=Math.cbrt(Double.parseDouble(s2));
t.setText(String.valueOf(res));
break;
case 10:
res=Math.sin(Double.parseDouble(s2));
t.setText(String.valueOf(res));
break;
case 11:
res=Math.log(Double.parseDouble(s2)); 
t.setText(String.valueOf(res));                                              
break;  
}
}
}
}