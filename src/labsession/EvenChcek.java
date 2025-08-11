package labsession;

public class EvenChcek {
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void main(String[] args) {
	
		int testnumber = 10;
		if(isEven(testnumber)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		

	}

}
