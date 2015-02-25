


public class Resident {
	
	private String name, address, sex;
	private int age;
	
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
}
