package labsession6;

public class JavaExceptionHandlingQui {

	public static void main(String[] args) {
		int i = 1;
        try
        {
            i++;
        }
        catch (Exception e) 
        {
            i++;
        }
        finally
        {
            i++;
        }
        System.out.println(i);
    }
}
