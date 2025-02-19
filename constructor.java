class spr{
	public static void main(String s[])
	{
		spr a=new spr();
		a.demo();
	}
	public void demo()
	{
		System.out.println("This Is Demo");
	}
}
class spr
{
	spr()
	{
		System.out.println("This Is Spr Class");
	}
}
class spr
{
	spr()
	{
		System.out.println("This is class");
	}
	spr(String a)
	{
		System.out.println("Name ="+a);
	}
	public static void main(String s[])
	{
		spr a=new spr();
		a=new spr(s[0]);
	}
}