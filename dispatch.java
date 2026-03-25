class A
{
	void callme()
	{
		System.out.println("belongs to class A");
	}
}
class B extends A
{
	void callme()
		{
			System.out.println("belongs to class B");
		}
}
class C extends A
{
	void callme()
	{
		System.out.println("belongs to class C");
	}
	void callme1()
	{
	}
}
class dispatch
{
	public static void main(String args[])
	{
		A r;
		A obj1=new A();
		B obj2=new B();
		C obj3=new C();
		r=obj1;
		r.callme();
		r=obj2;
		r.callme();
		r=obj3;
		r.callme();
	}
}
	
