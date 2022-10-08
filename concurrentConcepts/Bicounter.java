package cuncurrency;

public class BiCounter {
	private int i = 0;
	private int j = 0;

	synchronized public void incrementj1() {
		i++;
	}

	public int getI() {
		return i;
	}

	synchronized public void incrementj() {
		j++;
	}

}
