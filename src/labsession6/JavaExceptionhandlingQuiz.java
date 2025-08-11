package labsession6;

public class JavaExceptionhandlingQuiz {

	public static void main(String[] args) {
		try
        {
            System.out.println("Try Block");
        
        System.out.println("-----");
	}
        catch (Exception e) 
        {
            System.out.println("Catch Block");
        }finally {
        	System.out.println("-----");
        }
	}
}
