/**
	 * This class represents a wizard for
	 * a D&D type game.
	 * @author arufus
	 * @version 1.0
	 * Lab 2
	 * CS131ON
	 *
	 */
public class Wizard implements Lockable {
	
	private String name;
	private int health;
	private int key;
	boolean locked;
		
		/**
		 * End constructor to put object into consistent state
		 */
	public Wizard() {
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
	public Wizard(String name) {
		this.name = name;
	}//end constructor
		
		/**
		 * This method processes the 
		 * damage to the object when 
		 * it is hit by other objects
		 * (e.g. weapons, lightening, etc.)
		 * @param power
		 */
	public void takeDamage(int power) {
		if (locked == true)
			 this.health = health - 0;
		else
			this.health = health - power;
	}//end takeDamage
		
		/**
		 * Getter for name
		 * @return
		 */
	public String getName() {
		return name;
	}//end getName
		
		/**
		 * Setter for name
		 * @param name
		 */
	public void setName(String name) {
		this.name = name;
	}//end setName
		
		/**
		 * Getter for health
		 * @return
		 */
	public int getHealth() {
		return health;
	}//end getHealth
		
		/**
		 * Setter for health
		 * @param health
		 */
	public void setHealth(int health) {
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
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

		/**
		 * Setter for the key
		 * @param key
		 */
		@Override
		public void setKey(int key) {
			if (key > 0 && this.key != key)
				this.key = key;
		} //end of setKey

		/**
		 * Method for locking a wizard and protecting from damage
		 * @param key
		 */
		@Override
		public void lock(int key) {
			if (this.key == key)
				locked = true;
			else
				locked = false;
		} //end of lock

		/**
		 * Method for unlocking and allowing a wizard to be damaged
		 * @param key
		 */
		@Override
		public void unlock(int key) {
			if (this.key == key)
				locked = false;
			else
				locked = true;
		} //end of unlock

		/**
		 * Getter for locked
		 * @return
		 */
		@Override
		public boolean isLocked() {
			return locked;
		} // end of isLocked
		
}//end class

