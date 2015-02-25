
import java.io.*;
import java.util.*;

public class Mainline {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner sc;
		Resident[] residents=new Resident[10];
		AuthorizedResident[] authorizedResident=new AuthorizedResident[10];
		int totalResidents=0;
		int totalAuthorized=0;
		
	try
	{
		
		sc=new Scanner(new File("ResidentInfo.txt"));
		while(sc.hasNextLine())
		{
			residents[totalResidents]=new Resident();
			residents[totalResidents].setName(sc.nextLine());
			boolean isAuthority=false;
			if(sc.nextLine().endsWith("yes"))
			{
				isAuthority=true;
			}
			residents[totalResidents].setSex(sc.nextLine());
			residents[totalResidents].setAge((int)Integer.parseInt(sc.nextLine()));
			residents[totalResidents].setAddress(sc.nextLine());
			if(isAuthority)
			{
				authorizedResident[totalAuthorized]=new AuthorizedResident();
				authorizedResident[totalAuthorized].setName(residents[totalResidents].getName());
				authorizedResident[totalAuthorized].setSex(residents[totalResidents].getSex());
				authorizedResident[totalAuthorized].setAge(residents[totalResidents].getAge());
				authorizedResident[totalAuthorized].setAddress(residents[totalResidents].getAddress());
				totalAuthorized++;
				
			}
			totalResidents++;
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	for(int i=0; i<totalAuthorized; i++)
		{
			if(authorizedResident[i].getSex().equals("female"))
			{
				int q1=authorizedResident[i].elderThanMe(residents, totalResidents);
				System.out.println("Name:- "+authorizedResident[i].getName()+"\nThe number of residents elder than you are "+q1);
			}
			if(authorizedResident[i].getSex().equals("male"))
			{
				int q2=authorizedResident[i].oldestPersonAge(residents, totalResidents);
				System.out.println("\n\nName:- "+authorizedResident[i].getName()+"\nThe age of oldest male person is " + q2 + ".\n");
			}
			if(authorizedResident[i].getAge()>12 && authorizedResident[i].getAge()<20)
			{
				System.out.println("\nName:- "+authorizedResident[i].getName());
				System.out.println("\nEnter the Address whose resident you want to know --> ");
				Scanner consolesc=new Scanner(System.in);
				String requestedAddress=consolesc.nextLine();
				authorizedResident[i].nameFromAddress(residents, totalResidents, requestedAddress);
				
			}
		}
		

	}
	

}
