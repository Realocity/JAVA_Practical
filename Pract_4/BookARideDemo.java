
public class BookARideDemo
{
	public static void main(String args[])
	{
		try
		{
		BookARide rideObj=new BookARide();
		rideObj.bookSeat(2);
		}
		catch(Exception e)
		{
			System.out.println("Custom Exception Handled");
		}
	}
}
