abstract class Parent
{
	int x;
}
abstract class Assignment extends Parent
{
    abstract public int childmethod();
    
}

class Child extends Assignment
{
	public int childmethod()
	{
		x=50;
		return x;
	}
}
public class Assignment2Q4 {
    public static void main(String[] args) {
    	Child obj=new Child();
    	int a=obj.childmethod();
    	System.out.println(a);  	
    }
}