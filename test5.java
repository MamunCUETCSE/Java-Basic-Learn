 import java.io.*;
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
	 	return sno +" "+sname+" "+total_marks;
	 }
}
class filehandling{
	public static void main(String[] args) throws Exception{
		File file = new File("unistudent.txt");
		unistudent s = new unistudent(1, "mamun abdullah", 980);
		System.out.println(s.display());
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(s);
		oos.close();
	}
}
//file read
class filehandling1{
	public static void main(String[] args) throws Exception{
		File file = new File("unistudent.txt");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		unistudent s1 =(unistudent)ois.readObject();
		ois.close();
		System.out.println(s1);
	}
}