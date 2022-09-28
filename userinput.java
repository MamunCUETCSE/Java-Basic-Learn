import java.util.Scanner;
class userinput{
	public static void main(String[] args) {
		Scanner s = new  Scanner(System.in);
		System.out.println("Enter an input: ");
		String name = s.nextLine();
		System.out.println("Your input is : "+ name);
	}
}