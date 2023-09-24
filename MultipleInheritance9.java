class Parent
{
	public void takeProperty(){
		System.out.println("Take 5 villas,100 kg Gold, 5 cars,5 Cr Rupees..All is your");

	}
	public void getMarrige(){
		System.out.println("Dear Daughter, youn have to marry boraiah..");

	}
	public void donateMoney(){
		System.out.println("Donate 90% of the case to poor people");

	}
	
}
class Child extends Parent
{
	public void getMarrige(){
		System.out.println("Dear Daughter, youn have to marry boraiah..");

	}
	public void donateMoney(){
		System.out.println("Donate 90% of the case to poor people");

	}
	public void buyCar(){
		System.out.println("I have purchased Mercehed Benz Car...");
	}
}
class  MultipleInheritance9
{
	public static void main(String[] args) 
	{
      Child c = new Child();
	  c.takeProperty();
	  c.getMarrige();
	  c.donateMoney();
	  c.buyCar();
	}
}
