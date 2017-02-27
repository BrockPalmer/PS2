package Base;

public class MyInteger {

	int iValue;

	public MyInteger(int val) {

		iValue = val;
	}

	public int GetValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		} else
			return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else
			return false;
	}

	public boolean isPrime() {
		if (iValue <= 1) {
			return false;
		}
		for (int i = 2; i < iValue; i++) {
			if (iValue % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isEven(int val) {
		if (val % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(int val) {
		if (val % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(int val) {
		if (val <= 1) {
			return false;
		}
		
		for (int i = 2; i < val; i++) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
		
	}

	public static boolean isEven(MyInteger num) {
		if (num.iValue % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isOdd(MyInteger num) {
		if (num.iValue % 2 != 0) {
			return true;
		} else
			return false;
	}

	public static boolean isPrime(MyInteger num) {
		if (num.iValue <= 1) {
			return false;
		}
		for (int i = 2; i < num.iValue; i++) {
			if (num.iValue % i == 0) {
				return false;
			}
		}
		return true;

	}

	public boolean equals(int value) {
		if (value == this.iValue){
			return true;
		}
		else
			return false;
	}

	public boolean equals(MyInteger num) {

		if (iValue == num.GetValue()){			
			return true;
		}
		else
			return false;

	}

	/* Testing before making testTwo:
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); System.out.print("Value: "); int iValue =
	 * input.nextInt(); MyInteger value = new MyInteger(iValue); input.close();
	 * // System.out.println(value.GetValue()); value.isOdd(); value.isEven();
	 * value.isPrime(); MyInteger.isEven(iValue); MyInteger.isOdd(iValue);
	 * MyInteger.isPrime(iValue); MyInteger.isEven(value);
	 * MyInteger.isOdd(value); MyInteger.isPrime(value);
	 * 
	 * }
	 */

}
