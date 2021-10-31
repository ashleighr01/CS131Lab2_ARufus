
public interface Lockable {

	public void setKey(int key); //end of setKey
	public void lock (int key); //end of lock
	public void unlock (int key); //end of unlock
	public boolean isLocked(); //end of isLocked
} //end of Lockable interface
