package EmailProject;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fname & lname");
		String fName=sc.nextLine();
		String lName=sc.nextLine();
		Email em1=new Email(fName,lName);
		System.out.println(em1.showInfo());
//		em1.setPassword("Rajesh");
//		System.out.println("password changed: "+em1.getPassword());
		sc.close();
	}

}
