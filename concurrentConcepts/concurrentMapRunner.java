package cuncurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class concurrentMapRunner {
//how many times a character repeates using hash map
//with thread safty
// we are introducing new class in java LongAdder
	public static void main(String[] args) {
		//ConcurrentMap will provice the thread safty
		ConcurrentMap<Character, LongAdder> occurences = new ConcurrentHashMap<>();
		String str = "karan king maker";
		for (char character : str.toCharArray()) {
			occurences.computeIfAbsent(character, ch -> LongAdder()).increment();
//			This code is not needed if IfAbsent is used mo change in the code
//			LongAdder longAdder = occurences.get(character);
//			if (longAdder == null) {
//				longAdder = new LongAdder();
//			}
//			longAdder.increment();
//			occurences.put(character, longAdder);
//			----till-----
			// reason why we are using longAdder because it provicdes atomic increament
			// operation

		}
		System.out.println(occurences);

	}

}

//concurrent collection make a lot of opperation which  involve multiple stepsto atomic operations it is the buty int it
