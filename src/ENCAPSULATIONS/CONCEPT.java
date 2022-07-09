//ENCAPSULATION Program
package ENCAPSULATIONS;

 class aaa extends CONCEPT//child class//just to see whether we are able to access this elements in child class or not
{
}

public class CONCEPT //parent class
{
	private String name1;//declare variable as a private complusory
	public void setname(String name)//declare method as a public compulsory
	{
		this.name1=name;//name=local variable*****name1= instance variable declared private
	}
	
	public String getname()
	{
		return name1;
	}
	
	public void m3()
	{
		System.out.println(name1);//RETURN NULL VALLUE OF STRING
		System.out.println("m3");//PRINT M3
	}
	
	public static void main(String[] args) 
	{
		CONCEPT e=new CONCEPT();
		e.setname("Saurabh");//first set any name by set name method***************
		System.out.println("ACCESS IN SAME CLASS= "+e.getname()+"\n");//then get or view it by using get name method***********
	
		
		System.out.println("ACCESS ALL METHODS OF THIS CONCEPT CLASS IN OTHER CLASS BY INHERITANCE CONCEPT ");
		aaa a=new aaa();
		 a.m3();
		a.setname("VAGHU");
		System.out.println(a.getname());
	}

}
//set name by setname method and print or get it by getname method
//this 2 methods are not predefined..we can change it.
//here we can access this CONCEPT methods of encapsulation in other class by creating second as child class
//inheritance concept imp here.
//