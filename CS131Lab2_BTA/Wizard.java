
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	static boolean invoked = false;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() 
	{
		name = "";
		health = 0;
		key = 0;
		locked = false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) 
	{
		this.name = name;
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) 
	{
		if (isLocked()==false)
		{
		health = health-power;
		}//end if
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() 
	{
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) 
	{
	this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() 
	{
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) 
	{
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey
	
	@Override
	public void setKey(int key)
	{
		if (key > 0 && invoked == false)
		{
		this.key = key;
		invoked = true;
		}//end if
		else System.out.println("Key has already been set");
	}//end setKey
	
	@Override
	public void lock(int keyCheck)
	{
		if(key == keyCheck)
			locked = true;
	}//end lock
	
	@Override
	public void unlock(int keyCheck)
	{
		if (key == keyCheck)
			locked = false;
	}//end unlock
	
	@Override 
	public boolean isLocked()
	{
		return locked;
	}

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class
