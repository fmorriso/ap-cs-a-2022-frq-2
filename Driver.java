/**
 * <b>Purpose:</b> A driver that will run both part A and part B of the FRQ 
 * @author Fred Morrison
 *
 */
public class Driver
{

	public static void main(String[] args)
	{
		Textbook bio2015 = new Textbook("Biology", 49.75, 2);
		Textbook bio2019 = new Textbook("Biology", 39.75, 3);
		
		System.out.format("Edition: %d%n", bio2019.getEdition());
		System.out.println(bio2019.getBookInfo());
		
		System.out.format("Can bio2019 substitute for bio2015? - %b%n", 
				bio2019.canSubstituteFor(bio2015));
	}

}
