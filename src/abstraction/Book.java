package abstraction;

public abstract class Book {

	protected String name;
	protected String author;
	protected double price;

	abstract void getDetails();

	//constr
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author, double price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	// 2ime methode non abstracte
	public void displayDetail() {
		System.out.println("Book [name=" + name + ", author=" + author + ", price=" + price + "]");
	}

	//methode polymorthimse
	public void displayDetail(String name) {

	}

}
