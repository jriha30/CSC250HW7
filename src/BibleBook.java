public class BibleBook
{
	private String bookName;
	private int numberOfChapters;
	private String chapterSummary;
	
	public BibleBook(String bookName, int numberOfChapters, String chapterSummary)
	{
		this.bookName = bookName;
		this.numberOfChapters = numberOfChapters;
		this.chapterSummary = chapterSummary;
	}
	public BibleBook(String colonDeliminated)
	{
		String[] parts = colonDeliminated.split(":");
		this.bookName = parts[0];
		this.numberOfChapters = Integer.parseInt(parts[1]);
		this.chapterSummary = parts[2];
	}
	public void display()
	{
		System.out.println(this.bookName + " (" + this.numberOfChapters + " Chapters)");
		System.out.println(this.chapterSummary);
	}
	public String getChapterSummary()
	{
		return this.chapterSummary;
	}
}