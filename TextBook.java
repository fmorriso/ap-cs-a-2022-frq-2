
public class TextBook extends Book
{
	private int edition;
	
	public TextBook(String bookTitle, double bookPrice, int bookEdition)	
	{
		super(bookTitle, bookPrice);
		edition = bookEdition;
	}
	
	public int getEdition() { return edition; }
	
	public boolean canSubstituteFor(TextBook that)
	{
		if(this.getTitle().equals(that.getTitle()))
			if(this.getEdition() >= that.getEdition())
				return true;
		
		return false;
		
	}
	
	public String getBookInfo()
	{
		return super.getBookInfo() + "-" + edition;
	}
}
