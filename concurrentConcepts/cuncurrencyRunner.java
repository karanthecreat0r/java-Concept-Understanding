package cuncurrency;

// have the counter class also in same package to work with this programe
//i++ not thread safe
//i++ is not atomic
//syncorinized -->only one thread at a point in time only one thread running this methoda
public class cuncurrencyRunner {
	synchronized static void main(String[] args) {
		counter count = new counter();
		count.increment();
		System.out.println(count.getI());
	}

}
