abstract class Animals
{
	String color,breed,name;
	abstract public void eat();
	public void speak()
	{
		System.out.println("Animal spoke");
	}
}
class B extends Animals
{
	public void eat()
	{
		System.out.println("Animal eats");
	}
	public static void main(String args[])
	{
		Animals a=new B();
		a.speak();
		a.eat();
		a.color="Black";
		a.breed="Lebarador";
		a.name="Dog";
		System.out.println("Color: "+a.color);
		System.out.println("breed: "+a.breed);
		System.out.println("Name: "+a.name);
	}
}