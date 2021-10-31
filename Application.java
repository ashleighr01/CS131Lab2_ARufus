
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a sample wizard
		Wizard wiz = new Wizard("Arthur");
		wiz.setHealth(100);
		wiz.setKey(1);
		System.out.println(wiz.toString());
		
		//Practice locking & unlocking
		System.out.println(wiz.isLocked());
		wiz.lock(1);
		System.out.println(wiz.isLocked());
		wiz.unlock(1);
		System.out.println(wiz.isLocked());
		
		//Takes damage unlocked
		wiz.takeDamage(25);
		System.out.println(wiz.toString());
		
		//Locks then attempts to take damage
		wiz.lock(1);
		wiz.takeDamage(15);
		System.out.println(wiz.toString());
		
		//Unlock & take damage
		wiz.unlock(1);
		wiz.takeDamage(15);
		System.out.println(wiz.toString());

	} //end of main
} //end of class
