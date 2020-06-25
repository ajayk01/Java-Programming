import java.util.*;       
 class matrix{
		 public static void main(String args[])
               {
               	
                 int i,c,r,n,j,a[][]=new int[9][9],b[][]=new int[9][9],m[][]=new int[9][9],k,sum=0,r1,c1;
                 System.out. println("Enter the row and column of the matrix");
	         Scanner in = new Scanner(System.in);
	         r = in.nextInt(); 
 		 c = in.nextInt();
 		 System.out. println("Enter the row and column of the matrix");
	         r1 = in.nextInt(); 
 		 c1 = in.nextInt();
                 if(r==c1){
		 System.out. println("Enter the element for the matrix A");
		 for(i=0;i<r;i++)
		   for(j=0;j<c;j++)
			a[i][j] = in.nextInt();
		 System.out. println("Enter the element for the matrix B");	
		 for(i=0;i<r1;i++)
		   for(j=0;j<c1;j++)
			b[i][j] = in.nextInt();
   		 for(i=0;i<r;i++){
                      for(j=0;j<c1;j++){
			for(k=0;k<r1;k++) 
                           {
                              sum=sum+a[i][k]*b[k][j];
                           }
                      m[i][j]=sum;
                      }
                     }
                 System.out. println("The multipiled matrix is");
		 for(i=0;i<r;i++){
		   for(j=0;j<c;j++){
                      System.out. print(m[i][j]+"\t");
                            }
				System.out.println();
				}
                        
                  }
                     else 
                         System.out.println("The matrix cannoted be multipiled");                 
                   }
              }
                
