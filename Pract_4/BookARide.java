 
class RideOverBookedException extends Exception
{
	public RideOverBookedException()
	{
		System.out.println("Total number of booking exceeds 4");
	}
}

public class BookARide 
{
	public void bookSeat(int totalNoOfBooking)throws RideOverBookedException
	{
		if(totalNoOfBooking>4)
		{
			throw new RideOverBookedException();
		}
		else
		{
			System.out.println("your seat is Successfully book");
		}
	}
}