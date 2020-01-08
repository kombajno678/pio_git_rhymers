package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

	public static final int COUNT = 12;
	public static final int NUMBER = -1;
	private int[] NUMBERS = new int[COUNT];

	public int total = NUMBER;

	public void countIn(int in) {
		if (!isFull())
			NUMBERS[++total] = in;
	}

	public boolean callCheck() {
		return total == NUMBER;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return NUMBER;
		return NUMBERS[total];
	}

	public int countOut() {
		if (callCheck())
			return NUMBER;
		return NUMBERS[total--];
	}

}
