package alg;

public class ZeroOne {

	private int value;
	
	public ZeroOne(int value) {
		normalize(value);
	}
	
	private void normalize(int value) {
		if (value >= 1) {
			this.value = 1;
		}
		
		if (value <= 0) {
			this.value = 0;
		}
	}
	
	public int getValue() { return value; };
	public void setValue(int value) { this.value = value; }
	
}
