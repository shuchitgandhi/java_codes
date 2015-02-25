

public class AuthorizedResident {
	
	private String name, address, sex;
	private int age,count=0;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	
	public void setSex(String sex)
	{
		this.sex=sex;
	}
	public String getSex()
	{
		return sex;
	}

	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public String personDetail()
	{
		return "Name: "+name+"\nSex: "+sex+"\nAge: "+age+"\nAddress: "+address;
	} 
	
	public int elderThanMe(Resident[] residents, int totalResidents)
	{
		int count=0;
		for(int i=0; i<totalResidents; ++i)
		{
			if(residents[i].getAge()>this.age)
				++count;
		}
		return count;
	}
	
	public int oldestPersonAge(Resident residents[], int totalResidents)
	{
		int maxAge=this.age;
		
		for(int i=0; i<totalResidents; ++i)
		{
			if(residents[i].getSex().equals("male"))
			{
				if(residents[i].getAge()>maxAge)
					maxAge=residents[i].getAge();
			}
		}
		
		return maxAge;
	}
	
	public void nameFromAddress(Resident residents[], int totalResidents, String requestedAddress)
	{
		System.out.print("\nThis is the address of ");
		
		for(int i=0; i<totalResidents; ++i)
		{
			if(residents[i].getAddress().equals(requestedAddress))
			{
				System.out.print(residents[i].getName() + " ");
				//return residents[i].getName();
				count++;
			}
			
		}
		
		if(count==0)
			System.out.println("none of the residents in our record.");
	}

}
