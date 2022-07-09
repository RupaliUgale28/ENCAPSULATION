package ENCAPSULATIONS;

public class PRACTICE {

//	private int a=10;
	int a;
	public void set(int x)
	{
	//	int a;
		this.a=x;
		
		
	}
	public int get()
	{
		return this.a;
		
	}
	public static void main(String[] args) {
		
		
		PRACTICE p=new PRACTICE();
		p.set(133);
		System.out.println(p.get());
		
		p.set(522);
		System.out.println(p.get());
	}

}
