

import java.util.Scanner;
public class staticStack {

		//public int size=5;
		public static int stack[]=new int[5];
		public static int top=-1;
		
		
		
		public static void main(String args[])
		{
			int choice;
			Scanner sc=new Scanner(System.in);
			do
			{
				System.out.println("1. Push");
				System.out.println("2. Pop");
				System.out.println("3. Display");
				System.out.println("4. Exit");
				
				System.out.println("Enter Choice");
				choice=sc.nextInt();
				
				switch(choice)
				{
					case 1 :  push();	break;
					case 2 :  pop();	break;
					case 3 :  display();	break;
					case 4 : System.exit(0);	
					default : System.out.println("Please enter valid choice");
				}
				
				
			}while(true);
		}
		
		public static void push()
		{
			int data;
			Scanner sc=new Scanner(System.in);
			if(top==4)
				System.out.println("STACK IS FULL");
			else
			{
				top++;   //-1 + 1  = 0
				System.out.println("Enter Element to Push"); //10
				data=sc.nextInt();
				stack[top]=data;
			}		//stack[0]
			//sc.close();
		}
		
			public static void pop()
		{
				int data;
				if(top==-1)
				System.out.println("STACK IS ");
				else
				{
				data=stack[top];
				top--;
				System.out.println(data+ "is popped");
				}
				
		}	
			public static void display()
		{
			
		int i;
		for(i=top;i>=0;i--)
		System.out.println(stack[i]);
		}
			
}
