import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver
{
	public static void main(String[] args) throws Exception
	{
		Driver.searchBooks();
	}
	static BibleBook searchBooks() throws Exception
	{
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the word for which you search: ");
		String keyWord = userInput.nextLine();
		userInput.close();
		ArrayList<BibleBook> books = new ArrayList<BibleBook>();
		Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/input.dat"));
		while(input.hasNext())
		{
			BibleBook a = new BibleBook(input.nextLine());
			books.add(a);
		}
		for(int i = 0; i < books.size(); i++)
		{
			String currentSummary = books.get(i).getChapterSummary();
			if(currentSummary.indexOf(keyWord) != -1)
			{
				books.get(i).display();
				return books.get(i);
			}
		}
		System.out.println("None");
		return null;
	}
}