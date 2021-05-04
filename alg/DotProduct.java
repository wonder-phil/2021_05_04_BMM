package alg;

public class DotProduct {
	
	public long multiplyCount = 0;
	public long addCount = 0;
	
	public int dotProduct(ZeroOne[] array_1, ZeroOne[] array_2) {
		assert(array_1.length == array_2.length);
		
		int dotProdValue = 0;
		
		for (int i=0; i < array_1.length; i++) {
			if (array_1[i].getValue() == 1 && array_2[i].getValue() == 1) {
				dotProdValue = 1;
				break;
			}
		}
		return dotProdValue;
	}
	

}

