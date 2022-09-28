import java.util.Scanner; // class scanner
import java.io.*;

class test4{
	public static void main(String[] args) {
		if(args.length!=0)
		{
           int n=Integer.parseInt(args[0]);
           System.out.println("square ="+n*n);
           System.out.println("Cube="+n*n*n);
		}
		else 
			System.out.println("Enter an argument");
	}
}
class mama{
	public static void main(String[] args) {
		System.out.println("mama jite gesi");
	}
}
class Domath{
	public static void main(String[] args) {
		if(args.length>=2)
		{
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			System.out.println("Addition="+(n1+n2));
			System.out.println("Substraction="+(n1-n2));
			System.out.println("Multiplication="+(n1*n2));
			System.out.println("Divsion="+(n1/n2));
		}
		else 
			System.out.println("Enter atleast 2 argument");
	}
}
class Domath1{
	public static void main(String[] args) {
		if(args.length>=2)
		{
			double n1=Double.parseDouble(args[0]);
			double n2=Double.parseDouble(args[1]);
			System.out.println("Addition="+(n1+n2));
			System.out.println("Substraction="+(n1-n2));
			System.out.println("Multiplication="+(n1*n2));
			System.out.println(String.format("Divsion=%.2f",(n1/n2)));
		}
		else 
			System.out.println("Enter atleast 2 argument");
	}
}
class Arithmatic{
	public static void main(String[] args) {
		byte b=20;
		short s=10;
		int i=s+b; // follow the rules of supertype and subtype 
		          // lower than int must be an interger
		float pi=3.14f;
		int t=8;
		float result=pi*t;
		System.out.println(i);
		System.out.println(result);

	}

}
class timecount{
	public static void main(String[] args) {
		int total_seconds = Integer.parseInt(args[0]);
		int days, hours, minutes,seconds;
		 days = total_seconds/86400;
		 hours = total_seconds % 86400/3600;
		 minutes = total_seconds % 86400 % 3600/60;
	     seconds = total_seconds % 86400 % 3600 %60;
		System.out.println("total days="+days);
		System.out.println("total hours= "+hours);
		System.out.println("total minutes= "+minutes);
		System.out.println("total seconds= "+seconds);

	}
}
//realtional operator
class relational{            
	public static void main(String[] args) {
		System.out.println(10>20);
		System.out.println(10<20);
		System.out.println(10>=20);
		System.out.println(10<=20);
		System.out.println(10!=20);
		System.out.println(10==20);
	}
}
//logical operator
class logical{
	public static void main(String[] args) {
		System.out.println(10>6 && 6>5);
		System.out.println(10<4 || 7>5);

		System.out.println(!(10>6 && 6>5));
		System.out.println(!(10<4 || 7>5));

	}
}
//increment and decrement 
class IncreDecre{
	public static void main(String[] args) {
		int a=5;
		int b = a++ + ++a + a++ + a--;
		System.out.println(a+" "+b);
		//assignment operator
		b +=10;
		System.out.println(b);
		b -=10;
		System.out.println(b);
		b *=10;
		System.out.println(b);
		b /=10;
		System.out.println(b);
	}
}
//Conditional or ternary operator
class ternary{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int max = a>b ? a : b;
		System.out.println("max = "+max);
	}
}
//Bitwise
class bitwise{
	public static void main(String[] args) {
		int n=42, m=15;
		System.out.printf("%-7s%-4d%10s\n","num1 = ",n,Integer.toBinaryString(n));
		System.out.printf("%-7s%-4d%10s\n","num1 = ",m,Integer.toBinaryString(m));
		System.out.printf("%-7s%-4d%10s\n","& oper = ",(n & m),Integer.toBinaryString(n & m ));
		System.out.printf("%-7s%-4d%10s\n","| opera = ",(n | m),Integer.toBinaryString(n | m));
		System.out.printf("%-7s%-4d%10s\n","^ opera= ",(n ^ m),Integer.toBinaryString(n ^ m));
	}
}
//Swap two numbers without using third variable and arithmatic operator
class Swap{
	public static void main(String[] args) {
		int a = 20, b= 30;
		System.out.println("Before swapping "+a+" "+b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("After swapping "+a+" "+b);

	}
}
//complement of a number
class complement{
	public static void main(String[] args) {
		int n=42;
		System.out.println(~n);
	}
	 }
//subtraction of two number without using -

class subtraction{
	public static void main(String[] args) {
		int n1=65, n2 = 40;
		int sub = n1 + (~n2) + 1;
		System.out.println(sub);
	}
}
// bitwise shift operation
class shift{
	public static void main(String[] args) {
		int n=39; 
		int n2=-1;
		System.out.println(n<<2);//left shift means multiply by 2
		System.out.println(n>>2);//rigt shift means divide by 2
		System.out.println(Integer.toBinaryString(n2));
		System.out.println(Integer.toBinaryString(n2>>>30));
		System.out.println(Integer.toBinaryString(n2>>>28));
		System.out.println(Integer.toBinaryString(n2>>>26));
	}
}
//user input

class userinput{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  // an object of scanner class
		System.out.println("Enter an input:");
		String name = s.nextLine();   //input string 
		System.out.println("Your name is : "+ name);
	}
}
//simple interest calculation
class interest{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter priciple: ");
		int p = s.nextInt();
		System.out.println("Enter number of years: ");
		int y = s.nextInt();
		System.out.println("Enter interest rate: ");
		float r = s.nextFloat();
		float interest = y * p * r/100;
		System.out.println("interest is : "+interest);
	}
}
//new operator is used to create an object of a class
class cricketer{
	int ccode;
	String cname;
	int cscore;
}
class onedaycricketer{
	public static void main(String[] args) {
		cricketer virat = new cricketer();// method cricketer() is the constructor
		virat.ccode = 2;
		virat.cname = "virat kohli";
		virat.cscore = 150;
		System.out.println("Player information is:"+virat.cname + " " +virat.ccode + " " + virat.cscore);

		cricketer rohit = new cricketer();
		rohit.ccode = 80;
		rohit.cname = "rohit sharma";
		rohit.cscore = 200;
		System.out.println("Player information :\n" + "Name :"+ rohit.cname + " \njursey number :" +rohit.ccode + " \nScore:" +rohit.cscore);

        int arr[] = new int[10]; // 10 objects of int array are createed
        arr[0] = 10;
        arr[1]  =20;
        System.out.println(arr[0] + " " + arr[1]);
	}
}
// instance is an object of a class
class employee{

}
class product{

}
class instance{
	public static void main(String[] args) {
		employee mamun = new employee();
		product key = new product();
		System.out.println(mamun instanceof employee);
		System.out.println(key instanceof product);

	}
}
//parent child instance
class parent{

}
class child extends parent{

}
class instance1{
 public static void main(String[] args) {
 	parent shah = new parent();
 	child mamun = new child();
 	System.out.println(shah instanceof parent);
 	System.out.println(mamun instanceof child);
 	System.out.println(mamun instanceof parent);
 	System.out.println(shah instanceof child);
 }
}
// if else part
class ifelse{
     public static void main(String[] args) {
     	Scanner s = new Scanner(System.in);
     	System.out.println("Enter an interger: ");
     	int n = s.nextInt();
     	if(n%2==0)
     		System.out.println("Number is even ");
     	else 
     		System.out.println("Number is odd");
     }
}
class ifelseif{
     public static void main(String[] args) {
     	Scanner s = new Scanner(System.in);
     	System.out.println("Enter a month : ");
     	int mon = s.nextInt();
     	if(mon == 1 || mon ==3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon ==12)
     		System.out.println("month " + mon +" has 31 days");
     	else if(mon == 4 || mon == 6 || mon == 9 || mon == 11)
     		System.out.println("month " + mon + " has 30 days");
     	else if(mon == 2)
     		System.out.println("Month " + mon + " has 28 days");
     	else 
     		System.out.println("There is no month like this");
     	

     }
}
class grade{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter bangla number:");
		int bangla = s.nextInt();
		System.out.print("Enter english number:");
		int eng = s.nextInt();
		System.out.print("Enter math number :");
		int math = s.nextInt();
		int total = bangla + eng + math;
		float per = total/3.0f;
		if(bangla >=40 && eng>=40 && math >=40)
		{
			if(per>=80)
				System.out.println("Got A++");
			else if(per>=70)
				System.out.println("Got A");
			else if(per>=60)
				System.out.println("Got a-");
			else 
				System.out.print("pass");

		}
		else 
			System.out.println("Fail");
	}
}
//java switch statements
class jswitch{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a month : ");
		int month = s.nextInt();
		switch(month)
		{
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("Month " + month + " has 31 days");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("Month"+ month + " has 30 days");
			break;
		case 2:
			System.out.println("Month " +month + " has 28 days ");
			break;
		default:
			System.out.print("No month available");
		}
	}
}
class sswitch{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a state: ");
		String state = s.nextLine();
		switch(state)
		{
		case "dhaka":
			System.out.println("Language : dhakaia ");
			break;
		case "chattogram":
			System.out.println("Language : chatgaia ");
			break;
		default :
			System.out.print("Language is bangala");

		}

	}
}
class fordemo{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
			System.out.println(i + " " +(i*i) + " " +(i*i*i));
		for(char c=65;c<=90;c++)
			System.out.print(c + " ");
		System.out.println();
		for(char c=97;c<=122;c++)
			System.out.print(c+ " ");
	}
}
//for each loop
class foreach{
	public static void main(String[] args) {
		for(String name : args) // here args is command line input
			System.out.println("Hi " + name);
	}
}
//nested for loop
class nestedloop{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n =  s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
// a number is prime or not
class primenum{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();

		boolean prime =true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				prime = false;
		}
		if(prime)
			System.out.print("The number is prime");
		else 
			System.out.print("number is not prime");
	}
}
//print prime number between in a range 
class primeprint{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int n = s.nextInt();
		for(int i=2;i<=n;i++)
		{
			boolean prime = true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
					prime = false;
			}
			if(prime)
				System.out.print(i+ " ");

		}
	}
}
//while loop
//reverse a number and check palindrome or not
class palindrome
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = s.nextInt();
		int temp =num,rev=0,rem;
		while(temp>0)
		{
			rem = temp %10 ;
			rev = rev *10 + rem;
			temp = temp/10;
		}
		System.out.println("Reverse number is : "+rev);
		if(rev == num)
			System.out.print(" This number is palindome");
		else 
			System.out.print(" not a palindrome");
	}
}
//java array declaration and definition
class array{
	public static void main(String[] args) {
		int arr[] = new int[10];
		int arr1[] = new int[] {10,2,9,9,0,3,6};
		int arr2[] = {10,20,30,40,50};
		System.out.println("Arry size is : " + arr.length +" array default value is : " + arr[0]);
		boolean brr[] = new boolean[5];
		System.out.println("Boolean array size is : "+ brr.length + " default boolean array value : " + brr[0]);
		String s[] = new String[10];
		System.out.println("string array size : " + s.length + " default value is : " + s[0]);//string default value is null
		char c[] = new char[10];
		System.out.println(c.length + " " + c[0]);//default value of char array is blank
		String name = "abdullah al mamun";
		System.out.println("String length is : " + name.length() + " data array length :  " + args.length);//strong length er jnno length() use hoi
	}
}
//Sort an array
class sortarray{
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.print("\n Before sorting \n");
		for(int num : arr)
		{
			System.out.print(num+ " ");
		}
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				arr[i] = arr[i] ^ arr[j];
				arr[j] = arr[i] ^ arr[j];
				arr[i] = arr[i] ^ arr[j];
			      }
			}

		}
		System.out.print("\n After sorting \n");
		for(int num : arr)
		{
			System.out.print(num +" ");
		}
	}
}
//2D array
class twodimarr{
	public static void main(String[] args) {
		int a[][] = new int[10][10];
		int a1[][] = {                   //every row has different number of column
			          {1},              //row a[0] has one column
			          {2,3},
			          {4,5,6},
			          {7,8,9,10}
		};
		System.out.println(a.length + " " + a1.length); //this will retrun number of rows of each array
		System.out.println(a[0].length + " " + a1[0].length);
		System.out.println("Print second 2D array a1:");
		for (int i= 0;i<a1.length;i++)
		{
			for(int j=0;j<a1[i].length;j++) //every row column length a1[i].length
			{
				System.out.print(a1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//matrix opeartion
class matrix{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int c =-1;
		int r1,c1,r2,c2;
		do{
			System.out.println("1 for matrix addition");
			System.out.println("2 for matrix subtraction");
			System.out.println("3 for matrix Multiplication");
			System.out.println("0 for exit");
			System.out.println("-----------------------------");
			c = s.nextInt();
			switch(c)
			{
			case 1:
				System.out.print("Enter number of rows for mat1:");
				 r1 = s.nextInt();
				System.out.print("Enetr number of column for mat 1:");
				 c1 = s.nextInt();
				System.out.print("Enter number of rows for mat2: ");
				 r2 = s.nextInt();
				System.out.print("Enter number of columns for mat2:");
				 c2 =s.nextInt();
				if(r1==r2 && c1==c2)
				{
				int mat1[][] = new int[r1][c1];
				int mat2[][] = new int[r2][c2];
				int add[][]  = new int[r1][c1];
				System.out.println("Enter value of mat1: ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						mat1[i][j] = s.nextInt();
					}
				}
				System.out.println("Enter value of mat2: ");
				for(int i=0;i<r2;i++)
				{
					for(int j=0;j<c2;j++)
					{
						mat2[i][j] = s.nextInt();
					}
				}
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						add[i][j] = mat1[i][j] + mat2[i][j];
					}
				}
				System.out.println("Addition matrix is: ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						System.out.print(add[i][j] + " ");
					}
					System.out.println();
				}

				}
			     else
			     	System.out.print("matrix addition not possible");
	
				break;
			case 2:
				System.out.print("Enter number of rows for mat1:");
				 r1 = s.nextInt();
				System.out.print("Enetr number of column for mat 1:");
				 c1 = s.nextInt();
				System.out.print("Enter number of rows for mat2: ");
				 r2 = s.nextInt();
				System.out.print("Enter number of columns for mat2:");
				 c2 =s.nextInt();
				if(r1==r2 && c1==c2)
				{
				int mat1[][] = new int[r1][c1];
				int mat2[][] = new int[r2][c2];
				int add[][]  = new int[r1][c1];
				System.out.println("Enter value of mat1: ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						mat1[i][j] = s.nextInt();
					}
				}
				System.out.println("Enter value of mat2: ");
				for(int i=0;i<r2;i++)
				{
					for(int j=0;j<c2;j++)
					{
						mat2[i][j] = s.nextInt();
					}
				}
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						add[i][j] = mat1[i][j] - mat2[i][j];
					}
				}
				System.out.println("Subtraction matrix is: ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						System.out.print(add[i][j] + " ");
					}
					System.out.println();
				}

				}
			     else
			     	System.out.print("matrix addition not possible");
	
				break;
			case 3:
				System.out.print("Enter number of rows for mat1:");
				 r1 = s.nextInt();
				System.out.print("Enetr number of column for mat 1:");
				 c1 = s.nextInt();
				System.out.print("Enter number of rows for mat2: ");
				 r2 = s.nextInt();
				System.out.print("Enter number of columns for mat2:");
				 c2 =s.nextInt();
				if(c1!=r2)
			     	System.out.print("matrix addition not possible");
				else{
				int mat1[][] = new int[r1][c1];
				int mat2[][] = new int[r2][c2];
				int mul[][]  = new int[r1][c1];
				System.out.println("Enter value of mat1: ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						mat1[i][j] = s.nextInt();
					}
				}
				System.out.println("Enter value of mat2: ");
				for(int i=0;i<r2;i++)
				{
					for(int j=0;j<c2;j++)
					{
						mat2[i][j] = s.nextInt();
					}
				}
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c2;j++)
					{
						for(int k=0;k<c1;k++)
						mul[i][j] += mat1[i][k] * mat2[k][j];
					}
				}
				System.out.println("multification matrix is: ");
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c2;j++)
					{
						System.out.print(mul[i][j] + " ");
					}
					System.out.println();
				}

				}
			   
				break;
			case 0:
				break;
			}
		}while(c!=0);

           }
	}

//Three dimentional arrays
class threedimarr{
	public static void main(String[] args) {
		int a[][][] = new int[5][4][4] ;//5 matrix of  4 rows and 4 columns
		for(int i=0;i<a.length;i++) // a.length return number of matrix
		{
			for(int j=0;j<a[i].length;j++) //a[i].length returns rows of every matrix
			{
				for(int k=0;k<a[i][j].length;k++) //returns columns for every matrix and its rows
				{
                          System.out.print(a[i][j][k] + " ");

				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
//java class, objects, methods, constructor
class player{
	String cname;//instance variable 
	int to_matches;// instance variable
	int total_runs;
	player() //constructor is a special type of function same name as class name which default constructor
	{
       cname = "mushfiqur rahim";
       to_matches = 500;
       total_runs =20000;
	}
	player(String cname, int total_runs, int to_matches)// parameterized constructor
	{
		this.cname = cname;
		this.to_matches =to_matches;
		this.total_runs =total_runs;
	}
	void setCricketer(String name, int runs, int matches) //parameterized method or function
	{
		cname = name;
		to_matches =matches;
		total_runs =runs;

	}
	//when instance variable name and function variable name are same
	/*
	void setCricketer(String cname, int total_runs, int to_matches)
	{
		this.cname = cname;
		this.to_matches =to_matches;
		this.total_runs =total_runs;

	}
	*/

	double avg()
	{
		double avg = (double) total_runs/to_matches; //conversion of int to double
		return avg;
	}
}
class CricketPlayer{
	public static void main(String[] args) {
		player mushi = new player(); //when object is created constructor method is automatically called;
		System.out.println(mushi.cname+ " aerage is :" + mushi.avg());
		player mahmudullah = new player("mahmudullah riad",8000,180); //constructor overloading 
		System.out.println(mahmudullah.cname + " Average is :"+ mahmudullah.avg());
		player tamim = new player(); //constructor overriding by setCricketer;
		tamim.setCricketer("tamim iqbal",12500,177);
		System.out.println(tamim.cname + " Average in oneday is :" + tamim.avg());
		player shakib = new player();
	     shakib.setCricketer("Shakib al hasan",14000,220);
		System.out.println(shakib.cname + " Average is : " + shakib.avg());
	}
}
//private variable in a class
class company{
	private String ename;
	private int esalary;
	private int eid;
	company(String ename, int esalary, int eid)
	{
		this.ename= ename;
		this.esalary = esalary;
		this.eid = eid;
	}
	void showemp() //private variable cannot access outside this class so a public method showemp has taken
	{
		System.out.println(ename + " " +esalary + " " + eid);
	}
}
class companyemp{
	public static void main(String[] args) {
		company e1 = new company("shamim",10000,101);
		e1.showemp();
	}
}
//java class members are
/*
1.class variable      -- are static variable ,no need to create object -- without creating object we can access it
				     only one copy of this type of variable is available
2.instance variable  --  are non-static variable ,we have to create object to access it
				     every objects has it own instance variable
3.initializer block  -- it is used to initialize value.---non-static 
				    it is executed just before the constructor is invoked
4.class initializer block -- it will be executed when class is loaded,known as static block
5.class methods  --static methods
6. instance methods -- non-static methods
7.constructor        -- it is used to create an objcet and to initialize the value
*/
class mamun{
	static String orgname = "Elhammartbd";// class variable no need to create object
	final static String institution = "CUET";  //this value cannot be changed by creating objects
	int salary; //instance variable are no-static
	String name;
	static { //class initializer block
             System.out.println("Class initializer block will be called when class is loaded");
	}
	{
		System.out.println("initializer block will be called before everytine constructor is called");
	}
	mamun()
	{
		System.out.print("i am mamun abdullah");
	}
	mamun(int salary, String name)
	{
		this.salary= salary;
		this.name = name;
	}
	static void display() //class method are static which is used to access static varible or class variable
	{
		System.out.println(orgname);
		System.out.print(institution);
	}
	void showinfo(){
		System.out.println(name + "  " + salary);
	}
}
class elhammart{
	public static void main(String[] args) {
		mamun.display(); //for static method no need to create object
		System.out.println(Math.PI);
		mamun obj1 = new mamun(2000000,"Mamun abdullah");
		obj1.showinfo();
		mamun obj2 = new mamun(30000,"Hasan mahmud");
		obj2.showinfo();

	}
}
//java method overloading
/*same fucntion name with different argument or parameter  
or different return type of same argument 
or different return type of same argument*/
class person{
	void printNAme(){
		System.out.println("Hello mamun");

	}
	void printNAme(String name){
		System.out.println("Hellow Mr "+ name);
	}
	void printNAme(String saluation, String cname)
	{
		System.out.println("hello " + saluation + " " + cname );
	}
	
	void printNAme(String cname, int saluation)
	{
		System.out.println(cname + " " +saluation);
	}
}
class overloaded{
	public static void main(String[] args) {
		person p = new person();
		p.printNAme();
		p.printNAme("Mamun Abdullah");
		p.printNAme("Mis "," Nazifa");
		p.printNAme("nazifa ", 102);
		
	}
}
//Java function call by vale and call by reference
class SSwap{
 int n;
 int m;
 void swap(int n, int m)
 {
 	this.n = n;
 	this.m = m;
 	this.n = this.n ^ this.m;
 	this.m = this.n ^ this.m;
 	this.n = this.n ^ this.m;
 	System.out.println("Inside swap function :"+ this.n + " " + this.m);
 }
 void swap(SSwap s)
 {
 	s.n = s.n ^ s.m;
 	s.m = s.n ^ s.m;
 	s.n = s.n ^ s.m;
 	System.out.println("Inside swap function: "+ s.n + " " +s.m);
 }
}

class callByValueReference{
	public static void main(String[] args) {
		int n=10;
		int m=20;
		SSwap s = new SSwap();
		System.out.println("Call by value-------");
		s.swap(n,m);
		System.out.println("After swapping : "+ n + " " + m);
		System.out.println("Call by Reference---------------");
		SSwap s1 = new SSwap();
		s1.n = 30;
		s1.m = 40;
		s1.swap(s1);
		System.out.print("after swapping: " + s1.n + " " +s1.m);
		
	}
}
//inheritance 
class A
{
	int i,j;
	{//initializer block
		i=100;
		j=200;
	}
	A()
	{
		System.out.println("Class A's constructor");
	}
	void disply()
	{
		System.out.println("sum :"+ (i*j));
	}
}
class B extends A{
	int k=10;
	B()
	{
		System.out.println("Class B's constructor");
	}
	void mul()
	{
		System.out.println("multiplication is "+(i*j*k));
	}
}
class C extends B
{
C()
	{
		System.out.println("Class C's constructor");
	}
}
class inheritance{
	public static void main(String[] args) {
		A a = new A();
		a.disply();
		B b = new B();
		b.mul();
		b.disply();
		C c = new C();
	}
}
class F{
	int i,j;
	F()
	{
		i=100;
		j=200;

	}
	void display()
	{
		System.out.println("A's display");
	}

}
class G extends F{
	int j,k;
	G(){
		j=300;
		k=400;

	}
	void display()//method overriding - dynamic polymorphism - runtime polymorphism - late binding
	{
		System.out.println("B's display");
	}
	void display1(int j,int k)// method overloading - static polymorphism - early binding
	{
		System.out.println(j + " " +k);
		System.out.println(this.j+ " " + this.k);
		System.out.println(super.i + " " + super.j);
		super.display();
		display();

	}
}
class inheritance1{
	public static void main(String[] args) {
		G g = new G();
		g.display();
		g.display1(30,40);
	}

}
//java method overloading 
class shah{
	void display()
	{
		System.out.println("Display shah");
	}
}
class mahedi extends shah{
	void display(int age)
	{
          System.out.println("Age is :"+ age );
	}
}
class overloading1{
	public static void main(String[] args) {
		mahedi m = new mahedi();
		m.display();
		m.display(22);
	}
}
//file handling in java
class unistudent implements Serializable{
	int sno;
	String sname;
	int total_marks;
	 unistudent(int sno, String sname, int total_marks)
	 {
	 	
	 	this.sno = sno;
	 	this.sname = sname;
	 	this.total_marks = total_marks;
	 }
	 public String display()
	 {
	 	return sno + " " + sname + " " +total_marks;
	 }
}
class filehandling{
	public static void main(String[] args) throws Exception{
		File file = new File("student.txt");
		unistudent s = new unistudent(1, "mamun abdullah", 980);
		System.out.println(s.display());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(s);
		oos.close();
	}
}