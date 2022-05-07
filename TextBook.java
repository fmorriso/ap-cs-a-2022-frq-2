
public class Textbook extends Book
{
	private int edition;
	
	public Textbook(String bookTitle, double bookPrice, int bookEdition)	
	{
		super(bookTitle, bookPrice);
		edition = bookEdition;
	}
	
	public int getEdition() { return edition; }
	
	public boolean canSubstituteFor(Textbook that)
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
