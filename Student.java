/**
 * 
 */

/**
 * @author DivyaVipin
 *
 */
class StudentDetails
{
	int id;
	String name;
	String address;
	int age;
	int mark1,mark2,mark3;
	StudentDetails(int id, String name,int age,String address,int mark1,int mark2,int mark3)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.address=address;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		
	}
	public void displayDetails()
	{
		System.out.println ("StudentDetail");
		System.out.println ("-------------");
		System.out.println ("Id= "+id);
		System.out.println ("Name= "+name);
		System.out.println ("Age= "+age);
		System.out.println ("Address= "+address);
	}
	public String  displayResult()
	{
		String resultStatus="";
		System.out.println (" Marks ");
		System.out.println ("-------------");
		double sum=mark1+mark2+mark3;
		double total=300;
		double result=(sum/total)*100;
		System.out.println ("Mark1: "+mark1);
		System.out.println ("Mark2: "+mark2);
		System.out.println ("Mark3: "+mark3);
		System.out.println ("Result: "+result+"%");
		if(result>40)
			resultStatus="Passed";
		else
			resultStatus="Failed";
		System.out.println ("ResultStatus: "+resultStatus);
		return resultStatus;
		
	}
}
public class Student {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDetails d1=new StudentDetails(1,"Divya",12,"Trivandrum",60,70,80);
		d1.displayDetails();
		d1.displayResult();
		StudentDetails d2=new StudentDetails(2,"Vipin",16,"Trivandrum",40,20,30);
		d2.displayDetails();
		d2.displayResult();
		StudentDetails d3=new StudentDetails(3,"Dhanya",20,"Trivandrum",90,90,90);
		d3.displayDetails();
		d3.displayResult();
	}

}
