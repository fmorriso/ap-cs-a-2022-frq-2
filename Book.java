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
	
	private Book() {/* prevent uninitialized construction of instances */}	
	
	public String getTitle() { return title; }
	public double getPrice() { return price; }
	
	public String getBookInfo()
	{
		return title + "-" + price;
	}
}
