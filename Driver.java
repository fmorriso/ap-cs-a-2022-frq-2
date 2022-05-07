/**
 * <b>Purpose:</b> A driver that will run both part A and part B of the FRQ 
 * @author Fred Morrison
 *
 */
public class Driver
{

	public static void main(String[] args)
	{
		TextBook bio2015 = new TextBook("Biology", 49.75, 2);
		TextBook bio2019 = new TextBook("Biology", 39.75, 3);
		System.out.format("Edition: %d%n", bio2019.getEdition());
		System.out.println(bio2019.getBookInfo());
	}

}
