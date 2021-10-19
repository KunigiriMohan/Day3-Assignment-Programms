import java.util.Scanner;
class Length_of_the_line
{
	public static void main(String arg[])
	
	{
	
             	 int x1,x2,y1,y2;
 
	         double length;
	
	         Scanner sc=new Scanner(System.in);
 
	         System.out.println("Enter x Co-ordinate of First Point of line");
	   
                 x1=sc.nextInt();
	    
                 System.out.println("Enter y Co-ordinate of First Point of line");
	   
                 y1=sc.nextInt();
 
	         System.out.println("Enter x Co-ordinate of Second Point of line");
	   
                 x2=sc.nextInt();
 
	         System.out.println("Enter y Co-ordinate of Second Point of line");
	   
                 y2=sc.nextInt();
	  	    
		 length=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	         System.out.println("Length of the line is "+length);
 
	}
 
}