package EmailProject;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String department;
	private String password;
	private int defaultpwdlen=8;
	private int maxCapacity=1024;
	private String alternateEmail;
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println(this.firstName+" "+this.lastName);
		
		this.department=getDepartment();
		System.out.println(department);
		this.password=getPassword(defaultpwdlen);
		System.out.println("Default pwd: "+password);
		email=firstName+"."+lastName+"@"+department+".tcs.com";
		System.out.println("Your eamil is: \n"+email);
		
	}
	private String getDepartment() {
		System.out.println("enter choice of Department:\n1. Sales\n2. Accnts\n3. Development\n0. None");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) {return "Sales";}
		else if(choice==2) {
			return "Accnts";
		}
		else if(choice==3) {
			return "Development";
		}
		else {
			return "None";
		}
	}
	private String getPassword(int defaultpwdlen) {
		String container="QWERTYUIOPASDFGHJKLZXCVBNM0123456789#$%@";
		char c[]=new char[defaultpwdlen];
		int random;
		for(int i=0;i<defaultpwdlen;i++) {
			random=(int)(Math.random()*container.length());
			c[i]=container.charAt(random);
		}
		return new String(c);
		
	}
	public void setAlternateEmail(String em) {
		this.alternateEmail=em;
	}
	public void setMaxCapacity(int cap) {
		this.maxCapacity=cap;
	}
	public void setPassword(String pwd) {
		this.password=pwd;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public String getPassword() {
		return password;
	}
	public String showInfo() {
		return "Name: "+firstName+" "+lastName+"\nmaxCapacity: "+maxCapacity+"\nemail: "+email;
	}
}
