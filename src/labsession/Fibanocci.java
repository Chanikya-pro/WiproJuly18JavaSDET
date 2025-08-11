package labsession;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		int f = 1;
		int s = 1;
		int t = 0;
		System.out.println(f);
		System.out.println(s);
		for (int i = 3; i <= n; i++) {
			t = f+s;
			System.out.println(t);
			
		
		f = s;
		s = t;
		}

	}

}
