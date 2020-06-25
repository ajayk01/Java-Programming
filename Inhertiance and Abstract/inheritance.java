import java.util.*;
class publish {
   String name;
   float prize;
   Scanner in = new Scanner(System.in);
   void getdata()
     {
        System.out.println("Enter the Publish name");
        name=in.nextLine();
        System.out.println("Enter the Publish Prize");
        prize=in.nextFloat();
     }
   void putdata()
    {
       System.out.println("The Publish name is :"+name);
       System.out.println("The Publish prize : "+prize);
       
    }
 }
class book extends publish{
    int page;
    Scanner in = new Scanner(System.in);
    
    void getdata()
     {
       
       super.getdata();
       System.out.println("Enter the book pages");
        page=in.nextInt();
     }
   void putdata()
    {
     super.putdata(); 
     System.out.println("The book pages are: "+page);
    }  
  }
class audio extends publish{
 float time;
 Scanner in = new Scanner(System.in);
    
void getdata()
     {
       
       super.getdata();
       System.out.println("Enter the audio playing time");
        time=in.nextFloat();
     }
  void putdata(){
       super.putdata();
       System.out.println("The audio playing time are :"+time);
    }
  }
class inheritance {
 public static void main(String args[])
    {
      book b=new book();
      audio a = new audio();
      b.getdata();
      a.getdata();
      b.putdata();
      a.putdata();
    }
}
