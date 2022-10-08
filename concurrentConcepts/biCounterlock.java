package cuncurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class biCounterLocks {
	private int i = 0;
	private int j = 0;

	// implementing locks
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	synchronized public void incrementI() {
		lockForI.lock();
		// get lock for i
		i++;
		// release lock for i
		lockForI.unlock();
	}

	public int getI() {

		return j;

	}

	synchronized public void incrementJ() {
		lockForJ.lock();
		// get lock for j
		j++;// it is not an Atomic operation
		// release lock for j
		lockForJ.unlock();
	}


}
//locks helps us to in the way that if two threads are tryinh to increament i and j they will be allowd to
//increament them
//--->where as if two threas are ready to increament to i they should execute one after the other thats
//where locks allow
