import java.util.Scanner;
class Compare_length_of_the_line
{
	public static void main(String arg[])
	
	{
	
             	 int x1,x2,x3,x4,y1,y2,y3,y4;
 
	         double length1,length2;
	
	         Scanner sc=new Scanner(System.in);
 
	        System.out.println(" Enter First Line Details");
			 System.out.println();
			System.out.println("Enter x Co-ordinate of First Point of First line");
	   
                 x1=sc.nextInt();
	    
                 System.out.println("Enter y Co-ordinate of First Point of First line");
	   
                 y1=sc.nextInt();
 
	         System.out.println("Enter x Co-ordinate of Second Point of First line");
	   
                 x2=sc.nextInt();
 
	         System.out.println("Enter y Co-ordinate of Second Point of First line");
	   
                 y2=sc.nextInt();
	  	    
			 length1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
 	 	    	 	    
  	   
			System.out.println();
			System.out.println();
			
			System.out.println(" Enter Second Line Details");
			System.out.println();
			System.out.println("Enter x Co-ordinate of First Point of Second line");
	   
                 x3=sc.nextInt();
	    
                 System.out.println("Enter y Co-ordinate of First Point of Second line");
	   
                 y3=sc.nextInt();
 
	         System.out.println("Enter x Co-ordinate of Second Point of Second line");
	   
                 x4=sc.nextInt();
 
	         System.out.println("Enter y Co-ordinate of Second Point of Second line");
	   
                 y4=sc.nextInt();
	  	    
		 length2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));	
			
			
			if(length1 == length2) {
				
				System.out.println(" The Length of Two Lines are Equal ");
			}else if(length1 > length2) {
				System.out.println(" The Length of First line is Greater than Second line");
			}else if(length2 > length1){
				System.out.println(" The Length of Second line is Greater than First line");
			}
			
	
	}
 
}