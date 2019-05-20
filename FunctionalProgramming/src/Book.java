
public class Book {
	private int price;
	private String name;
	private String category;

	public Book(int price, String name, String category) {
		this.price = price;
		this.name = name;
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return this.category;
	}

	@Override
	public String toString() {
		return "Book [price=" + price + ", name=" + name + ", category=" + category + "]";
	}
	
	

}
