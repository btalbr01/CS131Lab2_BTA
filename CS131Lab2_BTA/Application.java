
public class Application {

	public static void main(String[] args) 
	{
		Wizard wiz = new Wizard();
		wiz.setName("Gandalf");
		System.out.println("The wizard's name is " + wiz.getName());
		wiz.setHealth(50);
		System.out.println(wiz.getName() + "'s health is " + wiz.getHealth());
		wiz.setKey(1);
		System.out.println("Key is set to " + wiz.getKey());
		wiz.lock(1);
		wiz.takeDamage(30);
		System.out.println(wiz.toString());
		wiz.unlock(1);
		wiz.takeDamage(4);
		wiz.setKey(3);
		System.out.println(wiz.toString());
	}//end main
}//end class
