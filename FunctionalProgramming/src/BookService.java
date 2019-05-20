import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookService {

	private List<Book> books;

	public BookService() {
		Book book1 = new Book(12, "Book 1", "terror");
		Book book2 = new Book(22, "Book 2", "fiction");
		Book book3 = new Book(31, "Book 3", "fiction");
		Book book4 = new Book(4, "Book 4", "sports");

		books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		Collections.unmodifiableList(books);
	}

	public Map<String, List<Book>> getBooksCategoryTraditionalWay() {
		Map<String, List<Book>> items = new HashMap<>();
		for (Book book : this.books) {
			if ((book.getPrice() > 20)) {
				String category = book.getCategory();
				List<Book> bookList = items.get(category);
				if(bookList==null) {
					bookList = new ArrayList<>();
					items.put(category, bookList);
				} 
				bookList.add(book);
			}
		}
		return items;
	}

	public Map<String, List<Book>> getBooksByCatetory() {
		Map<String, List<Book>> booksByCategory = this.books.stream().filter(book -> book.getPrice() > 20)
				.collect(Collectors.groupingBy(Book::getCategory));
		return booksByCategory;
	}

	public static void main(String[] args) {
		BookService bookService = new BookService();
		Map<String, List<Book>> result = bookService.getBooksByCatetory();

		for (Map.Entry<String, List<Book>> elements : result.entrySet()) {
			System.out
					.println(" key " + elements.getKey() + " value " + Arrays.toString(elements.getValue().toArray()));
		}

		Map<String, List<Book>> result2 = bookService.getBooksCategoryTraditionalWay();

		result2.forEach(
				(key, value) -> System.out.println(" key " + key + " value " + Arrays.toString(value.toArray())));
	}

}
