/**
 * 
 * @author Fred Morrison
 *
 */
public class Book
{
	private String title; // book title
	private double price; // price of the book
	
	public Book(String bookTitle, double bookPrice)
	{
		title = bookTitle;
		price = bookPrice;
	}
	
	@SuppressWarnings("unused")
	private Book() {/* prevent uninitialized construction of instances */}	
	
	// getters
	public String getTitle() { return title; }
	public double getPrice() { return price; }
	
	// A method that could just have easily been toString() 
	// but this way makes it more challenging for the student.
	public String getBookInfo()
	{
		return title + "-" + price;
	}
}
