package abstraction;

public class MyBook extends Book {

//constructor with 3 parameter
	public MyBook(String title, String author, double price) {
		// le constructeur de la class mere est appele dans le super()
		super(title, author, price);
		// TODO Auto-generated constructor stub
	}

//redefinir la methode getdetail
	@Override
	void getDetails() {
		// TODO Auto-generated method stub
		System.out.println(this.toString());
		
		// 2ime methode non abstracte
		this.displayDetail();

	}

}
