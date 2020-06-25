import java.util.*;
class sorting
	{
		public static void main(String args[])
		{
			int a[]=new int[50],i,j,t,n;
			System.out.println("enter the number of array numbers:");
			Scanner it=new Scanner(System.in);
			n=it.nextInt();
			System.out.println("enter the array number:");
		for(i=0;i<n;i++)
			{
			
			a[i]=it.nextInt();
              }
              for(i=0;i<n;i++)
				{
		
					System.out.println(a[i]);	
				}
				for(i=0;i<n-1;i++)
			   
			     for(j=i+1;j<n;j++)
				
				   if(a[i]>a[j])
				      {
					t=a[i];
					a[i]=a[j];
					a[j]=t;	
				      }
  				
			     System.out.println("sorted array is:");
			     
			     for(i=0;i<n;i++)
				{
		
					System.out.println(a[i]);	
				}
			}
			}
				
		
		
