
public class Textbook extends Book
{
	private int edition;
	
	public Textbook(String bookTitle, double bookPrice, int bookEdition)	
	{
		super(bookTitle, bookPrice);
		edition = bookEdition;
	}
	
	public int getEdition() { return edition; }
	
	/**
	 * <b>Purpose:</b> Determines if the current textbook can be substituted for another textbook.
	 * @param that - the other textbook we are trying to become a substitute for.
	 * @return <code>true</code> if the current textbook is a valid substitute for the specified textbook instance;
	 * otherwise, returns <code>false</code>.
	 * @apiNote To be a valid substitute all of the following rules must be true:
	 * <ul>
	 * <li>The <code>title</code> of both textbooks must be identical
	 * <li>The <code>edition number</code> of the current textbook must be greater than
	 * or equal to the <code>edition number</code> of the proposed substitue.
	 * </ul>
	 */
	public boolean canSubstituteFor(Textbook that)
	{
		if(this.getTitle().equals(that.getTitle()))
			if(this.getEdition() >= that.getEdition())
				return true;
		
		return false;
		
	}
	
	/**
	 * Returns a string representation of the current instance
	 */
	public String getBookInfo()
	{
		return super.getBookInfo() + "-" + edition;
	}
}
