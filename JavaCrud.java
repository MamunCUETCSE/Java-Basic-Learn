import java.util.*;
import java.io.*;
class employeee implements Serializable{
	int eno;
	String ename;
	int salary;
	employeee(int eno, String ename,int salary)
	{
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
	public String toString()
	{
		return eno+" "+ename+" "+salary;
	}
}
class Crud{
	public static void main(String[] args) throws Exception{
		int choice = -1;
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		File file = new File("employee.txt");

		
		ArrayList<employeee> a = new ArrayList<employeee>();
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		if(file.isFile())
		{
			ois = new ObjectInputStream(new FileInputStream(file));
			a = (ArrayList<employeee>)ois.readObject();
			ois.close();
		}

		do{
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("0.Exit");
			System.out.println("Enter Your Choice:");
			choice = s.nextInt();
			switch(choice){
				case 1:
					System.out.println("How many employee u need:");
					int n = s.nextInt();
					for(int i=0;i<n;i++)
					{
				System.out.println("Enter employee no:");
				int enom = s.nextInt();

				System.out.println("Enter employe name:");
				String  enam = s1.nextLine();

				System.out.println("Enter employee salary:");
			     int esalary = s.nextInt();
			     a.add(new employeee(enom,enam,esalary));
			 }
			  oos = new ObjectOutputStream(new FileOutputStream(file));
			  oos.writeObject(a);
			  oos.close();
			  break;
			case 2:
				System.out.println(a);
				break;

			}

		}while(choice!=0);
	}
}