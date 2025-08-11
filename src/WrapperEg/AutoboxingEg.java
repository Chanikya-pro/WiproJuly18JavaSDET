package WrapperEg;

public class AutoboxingEg {
	public static void main(String[] arga) {
	
	// wrapping is the process of converting the primitive data types into objects
	
	// 8 wrapper clasess - Byte, Boolean, Character, Double, Float, Integer, Long, Short
    // autoboxing convert data type to object
	
	int a = 78;
	// autoboxing
	//Integer i = Integer.valueOf(a);
    Integer i = a;
	System.out.println(i);
	
	
	//unboxing
	
	Integer b = new Integer(3);
	int x = b.intValue();
	int y = b;
	System.out.println(x);
	System.out.println(y);
	}
}
